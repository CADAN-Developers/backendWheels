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
    private int cupos;
    private Mapa mapa;

    
    public Viaje(String conductor, String ruta, int costo, int calificacion, TipoViaje tipoViaje,int cupos) {
        this.conductor = conductor;
        this.ruta = ruta;
        this.costo = costo;
        this.calificacion = calificacion;
        this.tipoViaje = tipoViaje;
        this.fecha = new Date();
        this.cupos = cupos;
        this.mapa = new Mapa();
    }



    public Viaje(String pasajero, String conductor, String ruta, int costo, int calificacion, TipoViaje tipoViaje, Date fecha, int cupos, Mapa mapa) {
        this.pasajero = pasajero;
        this.conductor = conductor;
        this.ruta = ruta;
        this.costo = costo;
        this.calificacion = calificacion;
        this.tipoViaje = tipoViaje;
        this.fecha = fecha;
        this.cupos = cupos;
        this.mapa = mapa;
    }

    public Viaje() {
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

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public Mapa getMapa() {
        return mapa;
    }

    public void setMapa(Mapa mapa) {
        this.mapa = mapa;
    }

    
    
    
}
