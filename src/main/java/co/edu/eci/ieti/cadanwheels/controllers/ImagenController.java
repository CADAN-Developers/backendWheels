/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eci.ieti.cadanwheels.controllers;

import co.edu.eci.ieti.cadanwheels.entities.Imagen;
import co.edu.eci.ieti.cadanwheels.service.imp.ImagenServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Andres
 */
@Controller
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1")
public class ImagenController {
    
    @Autowired
    ImagenServiceImp imagenService;
    
    @RequestMapping(method = RequestMethod.POST, path = { "imagenes/" })
    public ResponseEntity<?> saveImagen(@RequestBody Imagen imagen){
        return new ResponseEntity<>(imagenService.saveImagen(imagen), HttpStatus.CREATED);
    }
}
