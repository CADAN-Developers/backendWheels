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
    private String clave;
    private String correo;
    private String telefono;
    private String tipoDocumento;
    private String documento;
    private String universidad;
    private String tipoUsuario;
    private String carne;
    private Integer saldo;
    private String foto;
   
    public Usuario(String nombre, String apellidos,String clave, String correo, String telefono, String tipoDocumento, String documento, String universidad, String tipoUsuario, String carne) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.clave = clave;
        this.correo = correo;
        this.telefono = telefono;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.universidad = universidad;
        this.tipoUsuario = tipoUsuario;
        this.carne = carne;
    }

    public Usuario(String nombre, String apellidos, String clave, String correo, String telefono, String tipoDocumento, String documento, String universidad, String tipoUsuario, String carne, String foto) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.clave = clave;
        this.correo = correo;
        this.telefono = telefono;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.universidad = universidad;
        this.tipoUsuario = tipoUsuario;
        this.carne = carne;
        this.foto = foto;
    }
    
    
    
    public Usuario() {
        this.nombre = "admin";
        this.apellidos = "eci";
        this.clave = "admin";
        this.correo = "admin@mail.com";
        this.telefono = "32045789";
        this.tipoDocumento = "CC";
        this.documento = "1020987945";
        this.universidad = "ECI";
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

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
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

    public String getuniversidad() {
        return universidad;
    }

    public void setuniversidad(String universidad) {
        this.universidad = universidad;
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

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }
    
    
    
    
}
