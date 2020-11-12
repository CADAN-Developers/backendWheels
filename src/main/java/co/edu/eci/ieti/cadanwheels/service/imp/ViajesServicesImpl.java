package co.edu.eci.ieti.cadanwheels.service.imp;

import co.edu.eci.ieti.cadanwheels.entities.TipoViaje;
import co.edu.eci.ieti.cadanwheels.entities.Viaje;
import co.edu.eci.ieti.cadanwheels.repositories.ViajesRepository;
import co.edu.eci.ieti.cadanwheels.service.ViajesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ViajesServicesImpl implements ViajesServices {

    @Autowired
    ViajesRepository vR;

    @Override
    public List<Viaje> findAll() {
        return  vR.findAll(Sort.by(Sort.Direction.ASC, "idViaje"));
        //return vR.findAll();
    }

    @Override
    public Viaje findById(int id) {
        return vR.findByIdViaje(id);
    }

    @Override
    public List<Viaje> findAllOfrecidos() {
        List<Viaje> ofrecidos = vR.findByTipoViaje("OFRECIDO");
        return ofrecidos;

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
    public List<Viaje> getRealizados(String pasajero) {
        List<Viaje> viajesPas = vR.findByPasajero(pasajero);
        List<Viaje> realizados = new ArrayList<>();
        for (Viaje v : viajesPas) {
            if (v.getTipoViaje().equals(TipoViaje.COMPLETADO)) {
                realizados.add(v);
            }
        }
        return realizados;
    }



    @Override
    public List<Viaje> getEnCursoCod(String conductor) {
        List<Viaje> viajesCon = vR.findByConductor(conductor);
        List<Viaje> enCurso = new ArrayList<>();
        for (Viaje v: viajesCon){
            if(v.getTipoViaje().equals(TipoViaje.EN_CURSO)){
                enCurso.add(v);
            }
        }
        return enCurso;
    }

    @Override
    public Viaje getEnCursoPas(String pasajero) {
        List<Viaje> viajesPas = vR.findByPasajero(pasajero);
        Viaje actual = null;
        for (Viaje v: viajesPas){
            if(v.getTipoViaje().equals(TipoViaje.EN_CURSO)){
                actual = v;
                break;
            }
        }
        return actual;
    }

    @Override
    public List<Viaje> getAgendadosPas(String pasajero) {
        List<Viaje> viajesPas = vR.findByPasajero(pasajero);
        List<Viaje> agendados = new ArrayList<>();
        for (Viaje v : viajesPas) {
            if (v.getTipoViaje().equals(TipoViaje.AGENDADO)) {
                agendados.add(v);
            }
        }
        return agendados;
    }


    @Override
    public List<Viaje> getAgendadosCon(String conductor) {
        List<Viaje> viajesCon = vR.findByConductor(conductor);
        List<Viaje> agendados = new ArrayList<>();
        for (Viaje v : viajesCon) {
            if (v.getTipoViaje().equals(TipoViaje.AGENDADO)) {
                agendados.add(v);
            }
        }
        return agendados;
    }


    @Override
    public void addViaje(Viaje viaje) {
        List<Viaje> viajes = vR.findAll(Sort.by(Sort.Direction.ASC, "idViaje"));
        if (viajes.size() == 0){
            viaje.setIdViaje(1);
        }else {
            Viaje ultimo = viajes.get(viajes.size() - 1);
            viaje.setIdViaje(ultimo.getidViaje() + 1);
        }
        vR.insert(viaje);
    }

    @Override
    public void updateViaje(Viaje viaje, int id) {
        Viaje actual = findById(id);
        if (actual != null) {
            deleteViaje(id);
            addViaje(viaje);
            if (actual.getTipoViaje().equals(TipoViaje.OFRECIDO) && actual.getCupos() - 1 > 0) {
                actual.setCupos(actual.getCupos() - 1);
                vR.save(actual);
            }
        }
    }

    @Override
    public void deleteViaje(int id) {
        /*Viaje actual = findById(id);
        boolean flag = true;
        if (actual.getTipoViaje().equals(TipoViaje.AGENDADO)){
            List<Viaje> viajes = getOfrecidos(actual.getConductor());
            for (Viaje viaje:viajes){
                if(viaje.getRuta().equals(actual.getRuta()) && viaje.getFecha().equals(actual.getFecha()) && viaje.getCosto() == actual.getCosto()){
                    vR.deleteByIdViaje(viaje.getidViaje());
                    viaje.setCupos(viaje.getCupos()+1);
                    vR.save(viaje);
                    flag = false;
                }
                }
            if (flag){
                Viaje nuevo = actual;
                nuevo.setPasajero(null);
                nuevo.setCupos(1);
                addViaje(nuevo);
            }
        }else if(actual.getTipoViaje().equals(TipoViaje.OFRECIDO)*/
        vR.deleteByIdViaje(id);


    }



}
