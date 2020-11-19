package co.edu.eci.ieti.cadanwheels.controllers;

import co.edu.eci.ieti.cadanwheels.entities.Viaje;
import co.edu.eci.ieti.cadanwheels.service.MapaService;
import co.edu.eci.ieti.cadanwheels.service.ViajesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1")
public class ViajesController {

    @Autowired
    ViajesServices vS;
    
    @GetMapping("/Viajes")
    public List<Viaje> findAll() {
        return vS.findAll();
    }

    @GetMapping("/Viaje/{id}")
    public Viaje findById(@PathVariable int id) { return vS.findById(id); }

    @GetMapping("/ViajeOfrecido/{id}")
    public List<Viaje> findByOfrecido(@PathVariable int id) { return vS.findByOfrecido(id); }

    @GetMapping("/ViajesOfrecidos")
    public List<Viaje> findAllOfrecidos() {
        return vS.findAllOfrecidos();
    }

    @GetMapping("/Ofrecidos/{conductor}")
    public List<Viaje> getOfrecidos(@PathVariable String conductor) {
        return vS.getOfrecidos(conductor);
    }


    @GetMapping("/Completados/{conductor}")
    public List<Viaje> getCompletados(@PathVariable String conductor) {
        return vS.getCompletados(conductor);
    }


    @GetMapping("/Realizados/{pasajero}")
    public List<Viaje> getRealizados(@PathVariable String pasajero) {
        return vS.getRealizados(pasajero);
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

    @GetMapping("/AgenadosCon/{conductor}")
    public List<Viaje> getAgendosCon(@PathVariable String conductor) {
        return vS.getAgendadosCon(conductor);
    }

    @PostMapping("/AddViaje")
    public void addViaje(@RequestBody Viaje viaje) {
        System.out.println(viaje);
        vS.addViaje(viaje);
    }

    @PutMapping("/UpdateViaje/{id}")
    public void updateViaje(@RequestBody Viaje viaje, @PathVariable int id) {
        vS.updateViaje(viaje, id);
    }

    @DeleteMapping("/DeleteViaje/{id}")
    public void deleteViaje(@PathVariable int id) {
        vS.deleteViaje(id);

    }

}
