package co.edu.eci.ieti.cadanwheels.repositories;

import co.edu.eci.ieti.cadanwheels.entities.Usuario;
import co.edu.eci.ieti.cadanwheels.entities.Viaje;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ViajesRepository extends MongoRepository<Viaje, String> {

    /**
     * Encuentra el ususario por correo de acuerdo al mail recibido
     * @param email direccion ha buscar el usuario
     * @return  El objeto usuario con el usuario inscrito
     */

    public List<Viaje> findByConductor(String conductor);

    public List<Viaje> findByPasajero(String pasajero);

    public Viaje findByIdViaje (int viaje);

    public void deleteByIdViaje (int viaje);

    public List<Viaje> findByTipoViaje(String tipoViaje);

    public List<Viaje> findByOfrecido (int viaje);


}
