/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eci.ieti.cadanwheels.repositories;

import co.edu.eci.ieti.cadanwheels.entities.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jairo Gomez
 */

@Component
public interface UserRepository  extends MongoRepository<Usuario, String>{
    
    /**
     * Encuentra el ususario por correo de acuerdo al mail recibido
     * @param email direccion ha buscar el usuario
     * @return  El objeto usuario con el usuario inscrito
     */
    public Usuario findByCorreo(String correo);

    
}
