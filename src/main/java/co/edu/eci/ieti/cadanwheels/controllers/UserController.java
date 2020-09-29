/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eci.ieti.cadanwheels.controllers;

import co.edu.eci.ieti.cadanwheels.entities.Usuario;
import co.edu.eci.ieti.cadanwheels.service.UsuarioService;
import co.edu.eci.ieti.cadanwheels.service.imp.UsuarioServiceImp;
import java.math.BigDecimal;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Jairo Gomez
 */
@Controller
public class UserController {

    @Autowired
    UsuarioServiceImp UsuarioService;

    @GetMapping("/addUsers")
    @ResponseBody
    public String addUser() {
        System.out.println("llega al back");
        Usuario usr = new Usuario();
        System.out.println(UsuarioService.saveUser(usr));
        return "adicion exitoso";

    }

    @PostMapping("/logUser")
    @ResponseBody
    public String logIn(@RequestParam(value = "correo") String correo, @RequestParam(value = "password") String password){
        boolean flag = false;
        Usuario usr =  UsuarioService.findByCorreo(correo);
        System.out.println("usuario " + usr.getCorreo());
        if (usr != null){
            if (usr.getClave().equals(password)){
                flag = true;
            }
        }
        JsonObjectBuilder  Jresp = Json.createObjectBuilder().add("isLog", flag);

        String resp = Jresp.build().toString();
        System.out.println(resp);
        return resp;
    } 

}
