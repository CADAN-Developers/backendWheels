package co.edu.eci.ieti.cadanwheels.service;

import co.edu.eci.ieti.cadanwheels.entities.TipoViaje;
import co.edu.eci.ieti.cadanwheels.entities.Viaje;

import java.util.List;

public interface ViajesServices {

    public List<Viaje> findAll();
    public Viaje findById(int id);
    public List<Viaje> findAllOfrecidos();
    public List<Viaje> getOfrecidos(String conductor);
    public List<Viaje> getCompletados(String conductor);
    public List<Viaje> getRealizados(String pasajero);
    public List<Viaje> getEnCursoCod(String conductor);
    public Viaje getEnCursoPas(String pasajero);
    public List<Viaje> getAgendadosPas(String pasajero);
    public List<Viaje> getAgendadosCon(String conductor);
    public void addViaje(Viaje viaje);
    public void updateViaje(Viaje viaje, int id);
    public void deleteViaje(int id);

}
