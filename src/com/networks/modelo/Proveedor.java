package com.networks.modelo;

public class Proveedor {

    private int idProveedor;
    private String nombre;
    private String pContacto;
    private String telefono;

    @Override
    public String toString() {
        return "Proveedor{" +
                "idProveedor=" + idProveedor +
                ", nombre='" + nombre + '\'' +
                ", pContacto='" + pContacto + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    public Proveedor() {
    }

    public Proveedor(int idProveedor, String nombre, String pContacto, String telefono) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.pContacto = pContacto;
        this.telefono = telefono;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getpContacto() {
        return pContacto;
    }

    public void setpContacto(String pContacto) {
        this.pContacto = pContacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
