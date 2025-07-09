/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.transitosoft.dominio;

import pe.edu.pucp.transitosoft.enums.Gravedad;

/**
 *
 * @author Usuario
 */
public class Infraccion {
    private int infraccionId;
    private String descripcion;
    private double montoMulta;
    private Gravedad gravedad;
    private int puntos;

    public Infraccion() {
    }

    public Infraccion(int infraccionId, String descripcion, double montoMulta, Gravedad gravedad, int puntos) {
        this.infraccionId = infraccionId;
        this.descripcion = descripcion;
        this.montoMulta = montoMulta;
        this.gravedad = gravedad;
        this.puntos = puntos;
    }

    public int getInfraccionId() {
        return infraccionId;
    }

    public void setInfraccionId(int infraccionId) {
        this.infraccionId = infraccionId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMontoMulta() {
        return montoMulta;
    }

    public void setMontoMulta(double montoMulta) {
        this.montoMulta = montoMulta;
    }

    public Gravedad getGravedad() {
        return gravedad;
    }

    public void setGravedad(Gravedad gravedad) {
        this.gravedad = gravedad;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
}
