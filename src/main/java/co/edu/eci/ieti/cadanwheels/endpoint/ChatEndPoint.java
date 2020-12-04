/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eci.ieti.cadanwheels.endpoint;

import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jairo Gomez
 */

@Component
@ServerEndpoint("/apiChat/{idViaje}")

public class ChatEndPoint {
    
    private static final Logger logger = Logger.getLogger(ChatEndPoint.class.getName());
     //Queue for all open WebSocket sessions 
    static Queue<Session> queue = new ConcurrentLinkedQueue<>(); 
    Session ownSession = null; 
    
    
    public void send(String msg, final String viaje) {
        System.out.println("estoy enviando un mensaje del viaje : " + viaje);
        try {
            /* Send updates to all open WebSocket sessions */
            for (Session session : queue) {
                if ((!session.equals(this.ownSession) && (session.getUserProperties().get("idViaje").equals(viaje)))){
                    session.getBasicRemote().sendText(msg);
                }
                logger.log(Level.INFO, "Sent: {0}", msg);
            }
        } catch (IOException e) {
            logger.log(Level.INFO, e.toString());
        }
    }
    
    @OnMessage
    public void processPoint(String message, Session session, @PathParam("idViaje") String viaje) {
        logger.log(Level.INFO,"Message received:" + message + ". From session: "
                + session);
        this.send(message,viaje);
    }
    
    @OnOpen
    public void openConnection(Session session,@PathParam("idViaje") final String viaje) {
        /* crea la sala y guarda el numero en la session*/
        session.getUserProperties().put("idViaje",viaje);
        queue.add(session);
        ownSession = session;
        logger.log(Level.INFO, "Connection opened.");
        try {
            session.getBasicRemote().sendText("Connection established.");
        } catch (IOException ex) {
            logger.log(Level.SEVERE, null, ex);
        }
    }
    
    
    @OnClose
    public void closedConnection(Session session) {
        /* Remove this connection from the queue */
        queue.remove(session);
        logger.log(Level.INFO, "Connection closed.");
    }
    
    @OnError
    public void error(Session session, Throwable t) {
        /* Remove this connection from the queue */
        queue.remove(session);
        logger.log(Level.INFO, t.toString());
        logger.log(Level.INFO, "Connection error.");
    }
    
}
