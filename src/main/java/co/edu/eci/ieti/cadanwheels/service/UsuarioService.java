/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eci.ieti.cadanwheels.service;

import co.edu.eci.ieti.cadanwheels.entities.Usuario;
import java.util.List;

/**
 *
 * @author Jairo Gomez
 */
public interface UsuarioService {
    
     public Boolean saveUser(Usuario user);
     public Usuario findByCorreo(String correo);

     /**
      * Metodo que retorna todos los usuarios registrados
      * @return Retorna todos los usuarios.
      */
     public List<Usuario> getAll();

     /**
      * Metodo que permite actualizar un usuario.
      * @param user Es el usuario a actualizar.
      */
     public Boolean updateUser(Usuario usuario);

}
