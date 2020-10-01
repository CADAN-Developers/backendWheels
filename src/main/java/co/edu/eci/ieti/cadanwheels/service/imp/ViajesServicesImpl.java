package co.edu.eci.ieti.cadanwheels.service.imp;

import co.edu.eci.ieti.cadanwheels.entities.TipoViaje;
import co.edu.eci.ieti.cadanwheels.entities.Viaje;
import co.edu.eci.ieti.cadanwheels.repositories.ViajesRepository;
import co.edu.eci.ieti.cadanwheels.service.ViajesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ViajesServicesImpl implements ViajesServices {

    @Autowired
    ViajesRepository vR;

    @Override
    public List<Viaje> findAll() {
        return vR.findAll();
    }

    @Override
    public List<Viaje> getOfrecidos(String conductor) {
        List<Viaje> viajesCon = vR.findByConductor(conductor);
        List<Viaje> ofrecidos = new ArrayList<>();

        for (Viaje v: viajesCon){
            if(v.getTipoViaje().equals(TipoViaje.OFRECIDO)){
                ofrecidos.add(v);
            }
        }
        return ofrecidos;
    }

    @Override
    public Viaje getOfrecidobyId(int id, String conductor) {
        List<Viaje> viajesCon = vR.findByConductor(conductor);
        Viaje actual = null;
        for (Viaje v: viajesCon){
            if(v.getTipoViaje().equals(TipoViaje.OFRECIDO) && v.getidViaje()==id){
                actual = v;
            }
        }
        return actual;
    }

    @Override
    public List<Viaje> getCompletados(String conductor) {
        List<Viaje> viajesCon = vR.findByConductor(conductor);
        List<Viaje> completados = new ArrayList<>();

        for (Viaje v : viajesCon) {
            if (v.getTipoViaje().equals(TipoViaje.COMPLETADO)) {
                completados.add(v);
            }
        }
        return completados;
    }

    @Override
    public Viaje getCompletadosbyId(int id, String conductor) {
        List<Viaje> viajesCon = vR.findByConductor(conductor);
        Viaje actual = null;
        for (Viaje v: viajesCon){
            if(v.getTipoViaje().equals(TipoViaje.COMPLETADO) && v.getidViaje()==id){
                actual = v;
            }
        }
        return actual;
    }

    @Override
    public List<Viaje> getRealizados(String pasajero) {
        List<Viaje> viajesCon = vR.findByPasajero(pasajero);
        List<Viaje> realizados = new ArrayList<>();
        for (Viaje v : viajesCon) {
            if (v.getTipoViaje().equals(TipoViaje.REALIZADO)) {
                realizados.add(v);
            }
        }
        return realizados;
    }


    @Override
    public Viaje getRealizadosbyId(int id, String pasajero) {
        List<Viaje> viajesCon = vR.findByPasajero(pasajero);
        Viaje actual = null;
        for (Viaje v: viajesCon){
            if(v.getTipoViaje().equals(TipoViaje.REALIZADO) && v.getidViaje()==id){
                actual = v;
            }
        }
        return actual;
    }

    @Override
    public void addViaje(Viaje viaje) {

    }

    @Override
    public Viaje updateViaje(Viaje viaje) {
        return null;
    }

    @Override
    public void deleteViaje(int id, String conductor) {

    }



}
