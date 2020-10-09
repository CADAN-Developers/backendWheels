package co.edu.eci.ieti.cadanwheels.service;

import co.edu.eci.ieti.cadanwheels.entities.TipoViaje;
import co.edu.eci.ieti.cadanwheels.entities.Viaje;

import java.util.List;

public interface ViajesServices {

    public List<Viaje> findAll();
    public List<Viaje> getOfrecidos(String conductor);
    public Viaje getOfrecidobyId(int id, String conductor);
    public List<Viaje> getCompletados(String conductor);
    public Viaje getCompletadosbyId(int id, String conductor);
    public List<Viaje> getRealizados(String pasajero);
    public Viaje getRealizadosbyId(int id, String pasajero);
    public List<Viaje> getEnCursoCod(String conductor);
    public Viaje getEnCursoPas(String pasajero);
    public List<Viaje> getAgendadosPas(String pasajero);
    public Viaje getAgendadobyIdPas(int id, String pasajero);
    public List<Viaje> getAgendadosCon(String conductor);
    public Viaje getAgendadobyIdCon(int id, String conductor);
    public void addViaje(Viaje viaje);
    public Viaje updateViaje(Viaje viaje);
    public void deleteViaje(int id, String conductor);

}
