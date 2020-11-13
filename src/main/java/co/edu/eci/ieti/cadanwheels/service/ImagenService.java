/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eci.ieti.cadanwheels.service;

import co.edu.eci.ieti.cadanwheels.entities.Imagen;
import java.util.List;

/**
 *
 * @author Andres
 */
public interface ImagenService {
    
    List<Imagen> findAll();
    Imagen saveImagen(Imagen imagen);
    
}
