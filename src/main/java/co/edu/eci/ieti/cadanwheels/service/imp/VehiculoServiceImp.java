package co.edu.eci.ieti.cadanwheels.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.eci.ieti.cadanwheels.entities.Vehiculo;
import co.edu.eci.ieti.cadanwheels.repositories.VehiculoRepository;
import co.edu.eci.ieti.cadanwheels.service.VehiculoService;


public class VehiculoServiceImp implements VehiculoService {

    @Autowired
    private VehiculoRepository repo;

    @Override
    public List<Vehiculo> getVehiculosConductor(String conductor) {
        return repo.findByCorreo(conductor);
    }

   
    @Override
    public boolean addVehiculoConductor(Vehiculo vehiculo) {
        boolean res=true;
        try{
            repo.save(vehiculo);
        }catch(Exception e){
            res=false;
        }
        return res;
    }

    @Override
    public boolean updateVehiculoConductor(String placa, Vehiculo vehiculo) {
        boolean res=deleteVehiculoConductor(placa);
        if(res){
            res=addVehiculoConductor(vehiculo);
        }
        return res;
    }

    @Override
    public boolean deleteVehiculoConductor(String placa) {
        return repo.deleteByPlaca(placa);
    }

    
}
