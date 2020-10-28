package co.edu.eci.ieti.cadanwheels.entities;

import java.util.Date;

public class Vehiculo {
    String correoDueño;
    String placa;
    String marca;
    String color;
    String matricula;
    int capacidad;
    Date fechaSoat;
    String soat;

    public Vehiculo(String correoDueño, String placa, String marca, String color, String matricula, int capacidad, Date fechaSoat,
            String soat) {
        this.correoDueño=correoDueño;
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.matricula = matricula;
        this.capacidad = capacidad;
        this.fechaSoat = fechaSoat;
        this.soat = soat;
    }
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Date getFechaSoat() {
        return fechaSoat;
    }

    public void setFechaSoat(Date fechaSoat) {
        this.fechaSoat = fechaSoat;
    }

    public String getSoat() {
        return soat;
    }

    public void setSoat(String soat) {
        this.soat = soat;
    }

    public String getCorreoDueño() {
        return correoDueño;
    }

    public void setCorreoDueño(String correoDueño) {
        this.correoDueño = correoDueño;
    }

    

    
    
}
