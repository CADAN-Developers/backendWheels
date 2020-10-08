package co.edu.eci.ieti.cadanwheels.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import co.edu.eci.ieti.cadanwheels.entities.Vehiculo;
import co.edu.eci.ieti.cadanwheels.service.VehiculoService;

@Controller
public class VehiculoController {

    @Autowired
    private VehiculoService service;

    
    @PostMapping("/AddVehiculo")
    public boolean addVehiculo(@RequestBody Vehiculo vehiculo) {
        return service.addVehiculoConductor(vehiculo);

    }
    @DeleteMapping("/DeleteVehiculo/{placa}")
    public boolean deleteVehiculo(@PathVariable String placa) {
        return service.deleteVehiculoConductor(placa);
    }
    @PostMapping("/UpdateVehiculo/{placa}")
    public boolean updateVehiculoConductor(@PathVariable String placa, @RequestBody Vehiculo vehiculo){
        return service.updateVehiculoConductor(placa, vehiculo);
    }
    
    @GetMapping("/VehiculosConductor/{conductor}")
    public List<Vehiculo> getVehiculosConductor(@PathVariable String conductor) {
        return service.getVehiculosConductor(conductor);
    }

    
}
