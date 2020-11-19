/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eci.ieti.cadanwheels.service.imp;

import co.edu.eci.ieti.cadanwheels.entities.Imagen;
import co.edu.eci.ieti.cadanwheels.repositories.ImagenRepository;
import co.edu.eci.ieti.cadanwheels.service.ImagenService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Andres
 */
@Component
public class ImagenServiceImp implements ImagenService {

    @Autowired
    private ImagenRepository imagenRepository;

    @Override
    public List<Imagen> findAll() {
        return imagenRepository.findAll();
    }

    @Override
    public Imagen saveImagen(Imagen imagen) {
       return imagenRepository.save(imagen);
    }

}
