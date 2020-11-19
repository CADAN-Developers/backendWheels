/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eci.ieti.cadanwheels.entities;

import java.util.Objects;

/**
 *
 * @author AndresQuintero
 */
public class Imagen {
    
    private String usuario;
    private String urlCarnet;
    private String urlLicenciaConduccion;
    private String urlSoat;
    private String tipoUsuario;

    public Imagen(String usuario, String urlCarnet, String urlLicenciaConduccion, String urlSoat, String tipoUsuario) {
        this.usuario = usuario;
        this.urlCarnet = urlCarnet;
        this.urlLicenciaConduccion = urlLicenciaConduccion;
        this.urlSoat = urlSoat;
        this.tipoUsuario = tipoUsuario;
    }

    
    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUrlCarnet() {
        return urlCarnet;
    }

    public void setUrlCarnet(String urlCarnet) {
        this.urlCarnet = urlCarnet;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getUrlLicenciaConduccion() {
        return urlLicenciaConduccion;
    }

    public void setUrlLicenciaConduccion(String urlLicenciaConduccion) {
        this.urlLicenciaConduccion = urlLicenciaConduccion;
    }

    public String getUrlSoat() {
        return urlSoat;
    }

    public void setUrlSoat(String urlSoat) {
        this.urlSoat = urlSoat;
    }

    @Override
    public String toString() {
        return "Imagen{" + "usuario=" + usuario + ", urlCarnet=" + urlCarnet + ", urlLicenciaConduccion=" + urlLicenciaConduccion + ", urlSoat=" + urlSoat + ", tipoUsuario=" + tipoUsuario + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.usuario);
        hash = 37 * hash + Objects.hashCode(this.urlCarnet);
        hash = 37 * hash + Objects.hashCode(this.urlLicenciaConduccion);
        hash = 37 * hash + Objects.hashCode(this.urlSoat);
        hash = 37 * hash + Objects.hashCode(this.tipoUsuario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Imagen other = (Imagen) obj;
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.urlCarnet, other.urlCarnet)) {
            return false;
        }
        if (!Objects.equals(this.urlLicenciaConduccion, other.urlLicenciaConduccion)) {
            return false;
        }
        if (!Objects.equals(this.urlSoat, other.urlSoat)) {
            return false;
        }
        if (!Objects.equals(this.tipoUsuario, other.tipoUsuario)) {
            return false;
        }
        return true;
    }
    
    
}
