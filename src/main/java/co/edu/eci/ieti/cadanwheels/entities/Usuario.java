/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eci.ieti.cadanwheels.entities;

/**
 *
 * @author Jairo Gomez
 */
public class Usuario {
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;
    private String tipoDocumento;
    private String documento;
    private String universisdad;
    private String tipoUsuario;
    private String carne;

    public Usuario(String nombre, String apellidos, String correo, String telefono, String tipoDocumento, String documento, String universisdad, String tipoUsuario, String carne) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.universisdad = universisdad;
        this.tipoUsuario = tipoUsuario;
        this.carne = carne;
    }
    
    public Usuario() {
        this.nombre = "Daniel";
        this.apellidos = "Gomez";
        this.correo = "daniel@mail.com";
        this.telefono = "32045789";
        this.tipoDocumento = "CC";
        this.documento = "1020987945";
        this.universisdad = "ECI";
        this.tipoUsuario = "Usuario";
        this.carne = "2133714";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getUniversisdad() {
        return universisdad;
    }

    public void setUniversisdad(String universisdad) {
        this.universisdad = universisdad;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }
    
    
    
    
}
