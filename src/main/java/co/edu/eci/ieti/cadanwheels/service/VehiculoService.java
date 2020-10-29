package co.edu.eci.ieti.cadanwheels.service;

import java.util.List;

import co.edu.eci.ieti.cadanwheels.entities.Vehiculo;


public interface VehiculoService {
    /**
     * Consulta los vehiculos asociados al correo dado
     * @param conductor correo del dueño del vehiculo
     * @return Lista de vehiculos del conductor
     */
    public abstract List<Vehiculo> getVehiculosConductor(String conductor);
    /**
     * @param vehiculo Vehiculo a agregar
     * @return confimación de si se pudo realizar la accción
     */
    public abstract boolean addVehiculoConductor(Vehiculo vehiculo);
    /**
     * Borra el vehiculo dada la placa
     * @param placa placa del vehiculo
     * @return confirmación de si se pudo realizar la acción
     */
    public abstract boolean deleteVehiculoConductor(String placa);
    /**
     * Actualiza el vehiculo dada la placa y el vehiculo por el cual se actualiza
     * @param placa placa del vehiculo
     * @param vehiculo vehiculo con el cual se va a actualizar
     * @return confirmación de si se pudo realizar la acción
     */
    public abstract boolean updateVehiculoConductor(String placa, Vehiculo vehiculo); 
}
