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

import java.util.List;

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

    @Override
    public List<Usuario> getAll() {
        List<Usuario> listaUsuarios = null;
        try {
            listaUsuarios = userRepository.findAll();
            return listaUsuarios;
        } catch (Exception ex) {
            System.out.println("No se han podido obtener los usuarios");
            return listaUsuarios;
        }
    }

    @Override
    public Boolean updateUser(Usuario usuario) {
        Usuario usr = null;
        try {
            usr = userRepository.findByCorreo(usuario.getCorreo());
            if(usr.getCorreo() != null && usr.getCorreo() != ""){
                usuario.setIdUsuario(usr.getIdUsuario());
                userRepository.save(usuario);
                return true;
            } else {
                System.out.println("error usuario no encontrado");
                return false;
            }
        } catch (Exception e) {
            System.out.println("error al  encontrar el usuario");
            return false;

        }
    }

  
}
