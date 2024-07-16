package com.networks.modelo;

import java.math.BigDecimal;

public class RangoComisiones {
    private int id;
    private BigDecimal limiteInferior;
    private BigDecimal limiteSuperior;
    private double porcentaje;

    @Override
    public String toString() {
        return "RangoComisiones{" +
                "id=" + id +
                ", limiteInferior=" + limiteInferior +
                ", limiteSuperior=" + limiteSuperior +
                ", porcentaje=" + porcentaje +
                '}';
    }

    public RangoComisiones() {
    }

    public RangoComisiones(BigDecimal limiteInferior, BigDecimal limiteSuperior, double porcentaje) {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        this.porcentaje = porcentaje;
    }

    public RangoComisiones(int id, BigDecimal limiteInferior, BigDecimal limiteSuperior, double porcentaje) {
        this.id = id;
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        this.porcentaje = porcentaje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getLimiteInferior() {
        return limiteInferior;
    }

    public void setLimiteInferior(BigDecimal limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public BigDecimal getLimiteSuperior() {
        return limiteSuperior;
    }

    public void setLimiteSuperior(BigDecimal limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
}
