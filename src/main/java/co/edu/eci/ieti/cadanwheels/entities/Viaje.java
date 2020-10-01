package co.edu.eci.ieti.cadanwheels.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

public class Viaje {

    private int idViaje;
    private String pasajero;
    private String conductor;
    private String Ruta;
    private String descripcion;
    private int costo;
    private int calificacion;
    private TipoViaje tipoViaje;

    public Viaje(int idViaje, String pasajero, String conductor, String ruta, String descripcion, int costo, int calificacion, TipoViaje tipoViaje) {
        this.idViaje = idViaje;
        this.pasajero = pasajero;
        this.conductor = conductor;
        Ruta = ruta;
        this.descripcion = descripcion;
        this.costo = costo;
        this.calificacion = calificacion;
        this.tipoViaje = tipoViaje;
    }

    public int getidViaje() {
        return idViaje;
    }

    public void setId(int id) {
        this.idViaje = id;
    }

    public String getPasajero() {
        return pasajero;
    }

    public void setPasajero(String pasajero) {
        this.pasajero = pasajero;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String ruta) {
        Ruta = ruta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public TipoViaje getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(TipoViaje tipoViaje) {
        this.tipoViaje = tipoViaje;
    }
}
