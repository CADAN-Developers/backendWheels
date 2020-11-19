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
    public List<Viaje> findByOfrecido(int id) {
        return vR.findByOfrecido(id);
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
            if (actual.getTipoViaje().equals(TipoViaje.OFRECIDO)) {
                addViaje(viaje);
                System.out.println("guardo en add");
                vR.deleteByIdViaje(id);
                System.out.println("elimino en ofrecido");
                if (actual.getCupos() - 1 > 0) {
                    actual.setCupos(actual.getCupos() - 1);
                    vR.save(actual);
                    System.out.println("agrego otra vez el ofrecido");
                }
            }else{
                vR.deleteByIdViaje(id);
                System.out.println("elimino fuera de ofrecido");
                viaje.setIdViaje(id);
                vR.save(viaje);
                System.out.println("guardo en save");
            }
        }
    }

    @Override
    public void deleteViaje(int id) {
        Viaje actual = findById(id);
        if(actual.getTipoViaje().equals(TipoViaje.AGENDADO)){
            Viaje ofrecido = findById(actual.getOfrecido());
            ofrecido.setCupos(ofrecido.getCupos() +1);
            vR.deleteByIdViaje(actual.getOfrecido());
            vR.save(ofrecido);
        }else if(actual.getTipoViaje().equals(TipoViaje.OFRECIDO)){
            List<Viaje> agendados = vR.findByOfrecido(id);
            for (Viaje v:agendados){
                vR.deleteByIdViaje(v.getidViaje());
            }
        }
        vR.deleteByIdViaje(id);


    }



}
