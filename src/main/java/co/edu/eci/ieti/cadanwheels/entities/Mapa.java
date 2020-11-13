/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eci.ieti.cadanwheels.entities;

import java.util.ArrayList;
import javax.json.Json;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

/**
 *
 * @author Jairo Gomez
 */
public class Mapa {
    
    private String origen;
    private String destino;
    private ArrayList<String> ruta;
    private Integer valor;

    public Mapa(String origen, String destino, ArrayList<String> ruta, Integer valor) {
        this.origen = origen;
        this.destino = destino;
        this.ruta = ruta;
        this.valor = valor;
    }

    public Mapa() {
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public ArrayList<String> getRuta() {
        return ruta;
    }

    public void setRuta(ArrayList<String> ruta) {
        this.ruta = ruta;
    }

   

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
      
}
