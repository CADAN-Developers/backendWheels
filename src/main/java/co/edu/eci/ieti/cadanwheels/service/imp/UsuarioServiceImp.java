/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eci.ieti.cadanwheels.service.imp;

import co.edu.eci.ieti.cadanwheels.entities.Usuario;
import co.edu.eci.ieti.cadanwheels.repositories.UserRepository;
import co.edu.eci.ieti.cadanwheels.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jairo Gomez
 */
@Component
public class UsuarioServiceImp implements UsuarioService { 

    @Autowired
    private UserRepository userRepository;

    @Override
    public Boolean saveUser(Usuario user) {
        try {
            Long cantidad = userRepository.count();
            System.out.println(cantidad);
            userRepository.save(user);
            return true;
        } catch (Exception e) {
            System.out.println(e.getStackTrace()[0]);
            return false;
        }
    }

    @Override
    public Usuario findByCorreo(String correo) {
        Usuario usr = null;
        try {
            usr = userRepository.findByCorreo(correo);
        } catch (Exception e) {
            System.out.println("error al  encontrar el usuario");
        }
        return usr;
    }

  
}
