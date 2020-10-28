package co.edu.eci.ieti.cadanwheels.repositories;

import co.edu.eci.ieti.cadanwheels.entities.Vehiculo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author Andres Gonzalez
 */

@Component
public interface VehiculoRepository  extends MongoRepository<Vehiculo, String>{
    
    /**
     * Encuentra los vehiculos por correo 
     * @param correoDueño direccion a buscar el usuario
     * @return  lista de vehiculos del conductor
     */
    public List<Vehiculo> findByCorreoDueño(String correoDueño);

    /**
     * Busca el vehiculo por la placa
     * @param placa placa del vehiculo
     * @return vehiculo con la placa dada
     */
    public Vehiculo findByPlaca(String placa);

    /**
     * Borra el vehiculo dada la placa
     * @param placa placa del vehiculo
     * @return confimación de si se pudo hacer
     */
    public void deleteByPlaca(String placa);

    
}
