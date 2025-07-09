/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.transitosoft.dominio;

import jakarta.json.bind.annotation.JsonbTypeAdapter;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class VehiculoConductor {
    private Vehiculo vehiculo;
    private Conductor conductor;
    @JsonbTypeAdapter(DateAdapter.class)
    private Date fechaAdquisicion;

    public VehiculoConductor() {
    }

    public VehiculoConductor(Vehiculo vehiculo, Conductor conductor, Date fechaAdquisicion) {
        this.vehiculo = vehiculo;
        this.conductor = conductor;
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Date getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(Date fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }
    
}
