package co.edu.eci.ieti.cadanwheels.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

public class Viaje {

    private int idViaje;
    private String pasajero;
    private String conductor;
    private String ruta;
    private int costo;
    private int calificacion;
    private TipoViaje tipoViaje;
    private Date fecha;

    public Viaje(String conductor, String ruta, int costo, int calificacion, TipoViaje tipoViaje) {
        this.conductor = conductor;
        this.ruta = ruta;
        this.costo = costo;
        this.calificacion = calificacion;
        this.tipoViaje = tipoViaje;
        this.fecha = new Date();
    }

    public int getidViaje() {
        return idViaje;
    }

    public void setIdViaje(int id) {
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
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
