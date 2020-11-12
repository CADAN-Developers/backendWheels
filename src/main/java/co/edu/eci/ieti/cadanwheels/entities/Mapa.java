/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eci.ieti.cadanwheels.entities;

import java.util.ArrayList;
import javax.json.Json;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

/**
 *
 * @author Jairo Gomez
 */
public class Mapa {
    
    private Json origen;
    private Json destino;
    private ArrayList<Json> ruta;
    private Integer valor;

    public Mapa(Json origen, Json destino, ArrayList<Json> ruta, Integer valor) {
        this.origen = origen;
        this.destino = destino;
        this.ruta = ruta;
        this.valor = valor;
    }

    public Mapa() {
    }

    public Json getOrigen() {
        return origen;
    }

    public void setOrigen(Json origen) {
        this.origen = origen;
    }

    public Json getDestino() {
        return destino;
    }

    public void setDestino(Json destino) {
        this.destino = destino;
    }

    public ArrayList<Json> getRuta() {
        return ruta;
    }

    public void setRuta(ArrayList<Json> ruta) {
        this.ruta = ruta;
    }

   

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
      
}
