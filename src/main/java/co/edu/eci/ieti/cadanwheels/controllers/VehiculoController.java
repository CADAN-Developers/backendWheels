package co.edu.eci.ieti.cadanwheels.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import co.edu.eci.ieti.cadanwheels.entities.Vehiculo;
import co.edu.eci.ieti.cadanwheels.service.VehiculoService;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1")
public class VehiculoController {

    @Autowired
    private VehiculoService service;

   

    @PostMapping("/AddVehiculo")
    public boolean addVehiculo(@RequestBody Vehiculo vehiculo) {
        return service.addVehiculoConductor(vehiculo);

    }
    @DeleteMapping("/DeleteVehiculo")
    public boolean deleteVehiculo(@RequestParam String placa) {
        return service.deleteVehiculoConductor(placa);
    }
    @PostMapping("/UpdateVehiculo")
    public boolean updateVehiculoConductor(@RequestParam String placa, @RequestBody Vehiculo vehiculo){
        return service.updateVehiculoConductor(placa, vehiculo);
    }
    
    @GetMapping("/getVehiculos")
    public List<Vehiculo> getVehiculosConductor(@RequestParam String conductor) {
        return service.getVehiculosConductor(conductor);
    }

    
}
