package com.networks.modelo;




public class CuentaBancaria {
    private String id;
    private String tipoOperacion;
    private double cantidad;

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "id='" + id + '\'' +
                ", tipoOperacion='" + tipoOperacion + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    public CuentaBancaria() {
    }

    public CuentaBancaria(String id, String tipoOperacion, double cantidad) {
        this.id = id;
        this.tipoOperacion = tipoOperacion;
        this.cantidad = cantidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
