/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eci.ieti.cadanwheels.repositories;

import co.edu.eci.ieti.cadanwheels.entities.Imagen;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author Andres
 */
@Component 
public interface ImagenRepository extends MongoRepository<Imagen,String>{
    
}
