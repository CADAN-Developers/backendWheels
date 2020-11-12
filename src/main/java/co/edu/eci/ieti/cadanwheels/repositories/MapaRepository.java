/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eci.ieti.cadanwheels.repositories;

import co.edu.eci.ieti.cadanwheels.entities.Mapa;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Jairo Gomez
 */
public interface MapaRepository extends MongoRepository <Mapa,String> {

}
