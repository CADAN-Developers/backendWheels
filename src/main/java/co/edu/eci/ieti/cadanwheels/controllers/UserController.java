/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eci.ieti.cadanwheels.controllers;

import co.edu.eci.ieti.cadanwheels.entities.Usuario;
import co.edu.eci.ieti.cadanwheels.service.UsuarioService;
import co.edu.eci.ieti.cadanwheels.service.imp.UsuarioServiceImp;
import com.google.gson.Gson;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Jairo Gomez
 */
@Controller
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1")
public class UserController {

    @Autowired
    UsuarioServiceImp UsuarioService;
    
    @RequestMapping(method = RequestMethod.GET, path = { "usuarios/{correo}" })
    @ResponseBody
    public ResponseEntity<?> findByCorreo(@PathVariable("correo") String correo) {
        try {
            System.out.println("Consultando usuario: " + correo);
           
            Usuario consulUser = UsuarioService.findByCorreo(correo);

            return new ResponseEntity<>(consulUser, HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("No se ha podido retornar el usuario con e correo: " + correo,
                    HttpStatus.NOT_FOUND);
        }
    }

    
    @RequestMapping(method = RequestMethod.POST, path = { "usuarios/" })  
    public ResponseEntity<?> saveUser(@RequestBody String usuario) {
        try {
            System.out.println("Consultando usuario: ");
            System.out.println(usuario);

            Gson gson = new Gson();
            Usuario us = gson.fromJson(usuario, Usuario.class);

            boolean consulta;

            // verificar si existe el correo en base de datos
            if(UsuarioService.findByCorreo(us.getCorreo()) == null){
                // Agregar saldo en 0
                us.setSaldo(0);

                consulta = UsuarioService.saveUser(us);
            } else {
                consulta = false;
            }

            return new ResponseEntity<>(consulta, HttpStatus.CREATED);
        } catch (Exception ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);  
            return new ResponseEntity<>("No se ha podido registrar el usuario",
                    HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/addUsers")
    @ResponseBody
    public String addUser() {
        System.out.println("llega al back");
        Usuario usr = new Usuario();
        System.out.println(UsuarioService.saveUser(usr));
        return "adicion exitoso";

    }
    
    @CrossOrigin(origins = "*")
    @PostMapping("/logUser")
    @ResponseBody
    public String logIn(@RequestParam(value = "correo") String correo, @RequestParam(value = "password") String password) {
        boolean flag = false;
        Usuario usr = UsuarioService.findByCorreo(correo);
        System.out.println("usuario " + usr.getCorreo());
        if (usr != null) {
            if (usr.getClave().equals(password)) {
                flag = true;
            }
        }
        Gson g = new Gson();
        JsonObjectBuilder Jresp = Json.createObjectBuilder().add("isLog", flag);
        Jresp.add("usuario",g.toJson(usr));
        String resp = Jresp.build().toString();
        System.out.println(resp);
        return resp;
    }
    

}
