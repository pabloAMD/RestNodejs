/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author enriq
 */

public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private Cuenta cuenta;
    private Banco banco;
   

    public Usuario() {
    }

    public Usuario(int id, String nombre, String apellido, String correo,  Cuenta cuenta, Banco banco) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
   
        this.cuenta = cuenta;
        this.banco = banco;
    }

    public Banco getBanco() {
        return banco;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", cuenta=" + cuenta + ", banco=" + banco + '}';
    }

    


    
}
