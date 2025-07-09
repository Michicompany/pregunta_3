/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.transitosoft.dominio;

/**
 *
 * @author Usuario
 */
public class ReporteInfraccion {
    private int reporteId;
    private Conductor conductor;
    private Vehiculo vehiculo;
    private Infraccion infraccion;

    public ReporteInfraccion() {
    }

    public ReporteInfraccion(int reporteId, Conductor conductor, Vehiculo vehiculo, Infraccion infraccion) {
        this.reporteId = reporteId;
        this.conductor = conductor;
        this.vehiculo = vehiculo;
        this.infraccion = infraccion;
    }

    public int getReporteId() {
        return reporteId;
    }

    public void setReporteId(int reporteId) {
        this.reporteId = reporteId;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Infraccion getInfraccion() {
        return infraccion;
    }

    public void setInfraccion(Infraccion infraccion) {
        this.infraccion = infraccion;
    }
    
}
