/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.transitosoft.dominio;

/**
 *
 * @author Usuario
 */
public class Conductor {
    private int conductorId;
    private String nombres;
    private String paterno;
    private String materno;
    private String numLicencia;
    private TipoLicencia tipoLicencia;
    private int puntosAcumulados;

    public Conductor() {
    }

    public Conductor(int conductorId, String nombres, String paterno, String materno, String numLicencia, TipoLicencia tipoLicencia, int puntosAcumulados) {
        this.conductorId = conductorId;
        this.nombres = nombres;
        this.paterno = paterno;
        this.materno = materno;
        this.numLicencia = numLicencia;
        this.tipoLicencia = tipoLicencia;
        this.puntosAcumulados = puntosAcumulados;
    }

    public int getConductorId() {
        return conductorId;
    }

    public void setConductorId(int conductorId) {
        this.conductorId = conductorId;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(String numLicencia) {
        this.numLicencia = numLicencia;
    }

    public TipoLicencia getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(TipoLicencia tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    public int getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(int puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }
    
}
