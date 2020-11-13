/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eci.ieti.cadanwheels.controllers;

import co.edu.eci.ieti.cadanwheels.service.MapaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Jairo Gomez
 */
@Controller
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1")
public class MapaController { 
    @Autowired
    private MapaService mapaService;
    
    
    
    
}
