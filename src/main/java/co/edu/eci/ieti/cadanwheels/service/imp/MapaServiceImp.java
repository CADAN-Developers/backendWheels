/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eci.ieti.cadanwheels.service.imp;

import co.edu.eci.ieti.cadanwheels.entities.Mapa;
import co.edu.eci.ieti.cadanwheels.repositories.MapaRepository;
import co.edu.eci.ieti.cadanwheels.service.MapaService;
import java.util.List;
import java.util.Optional;
import javafx.collections.transformation.FilteredList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jairo Gomez
 */
@Component 
public class MapaServiceImp implements MapaService {    
    
   @Autowired
   private MapaRepository mapaRepository;

    @Override   
    public List<Mapa> findAll() {
        return mapaRepository.findAll();
    }

    
    
} 
