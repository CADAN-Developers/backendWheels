package co.edu.eci.ieti.cadanwheels.controllers;

import co.edu.eci.ieti.cadanwheels.entities.Viaje;
import co.edu.eci.ieti.cadanwheels.service.ViajesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ViajesController {

    @Autowired
    ViajesServices vS;

    @GetMapping("/Viajes")
    public List<Viaje> findAll() {
        return vS.findAll();
    }

    @GetMapping("/Ofrecidos/{conductor}")
    public List<Viaje> getOfrecidos(@PathVariable String conductor) {
        return vS.getOfrecidos(conductor);
    }

    @GetMapping("/Ofrecido/{id}/{conductor}")
    public Viaje getOfrecidobyId(@PathVariable int id, @PathVariable String conductor) {
        return vS.getOfrecidobyId(id, conductor);
    }

    @GetMapping("/Completados/{conductor}")
    public List<Viaje> getCompletados(@PathVariable String conductor) {
        return vS.getCompletados(conductor);
    }

    @GetMapping("/Completado/{id}/{conductor}")
    public Viaje getCompletadosbyId(@PathVariable int id, @PathVariable String conductor) {
        return vS.getCompletadosbyId(id, conductor);
    }

    @GetMapping("/Realizados/{pasajero}")
    public List<Viaje> getRealizados(@PathVariable String pasajero) {
        return vS.getRealizados(pasajero);
    }

    @GetMapping("/Realizado/{id}/{pasajero}")
    public Viaje getRealizadosbyId(@PathVariable int id, @PathVariable String pasajero) {
        return vS.getRealizadosbyId(id, pasajero);
    }

    @GetMapping("/EnCursoPas/{pasajero}")
    public Viaje getEnCursoPas(@PathVariable String pasajero) {
        return vS.getEnCursoPas(pasajero);
    }

    @GetMapping("/EnCursoCon/{conductor}")
    public List<Viaje> getEnCursoCon(@PathVariable String conductor) {
        return vS.getEnCursoCod(conductor);
    }

    @GetMapping("/AgenadosPas/{pasajero}")
    public List<Viaje> getAgendosPas(@PathVariable String pasajero) {
        return vS.getAgendadosPas(pasajero);
    }

    @GetMapping("/AgenadosPas/{id}/{pasajero}")
    public Viaje getAgendosPasbyId(@PathVariable int id, @PathVariable String pasajero) {
        return vS.getAgendadobyIdPas(id, pasajero);
    }

    @GetMapping("/AgenadosCon/{conductor}")
    public List<Viaje> getAgendosCon(@PathVariable String conductor) {
        return vS.getAgendadosCon(conductor);
    }

    @GetMapping("/AgenadosCon/{id}/{conductor}")
    public Viaje getAgendosConbyId(@PathVariable int id, @PathVariable String conductor) {
        return vS.getAgendadobyIdCon(id, conductor);
    }

    @PostMapping("/AddViaje")
    public void addViaje(@RequestBody Viaje viaje) {
        vS.addViaje(viaje);
    }

    @PutMapping("/UpdateViaje/{id}/{conductor}")
    public Viaje updateViaje(@RequestBody Viaje viaje, @PathVariable int id, @PathVariable String conductor) {
        if (vS.getOfrecidobyId(id, conductor) != null) {
            return vS.updateViaje(viaje);
        }
        vS.addViaje(viaje);
        return vS.getOfrecidobyId(viaje.getidViaje(), viaje.getConductor());
    }

    @DeleteMapping("/DeleteViaje/{id}/{conductor}")
    public void deleteViaje(@PathVariable int id, @PathVariable String conductor) {
        vS.deleteViaje(id, conductor);

    }

}
