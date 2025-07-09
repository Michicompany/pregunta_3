/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.transitosoft.persistencia.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import pe.edu.pucp.transitosoft.dbmanager.DBManager;
import pe.edu.pucp.transitosoft.dominio.Conductor;
import pe.edu.pucp.transitosoft.dominio.Vehiculo;
import pe.edu.pucp.transitosoft.dominio.VehiculoConductor;
import pe.edu.pucp.transitosoft.persistencia.DAO.VehiculoConductorDAO;

/**
 *
 * @author Usuario
 */
public class VehiculoConductorDAOImpl  implements VehiculoConductorDAO {


    @Override
    public void insertarRelacion(Vehiculo vehiculo, Conductor conductor, Date fechaAsignacion) throws SQLException {
        String query = "INSERT INTO EX1_VEHICULOS_POR_CONDUCTOR (VEHICULO_ID, CONDUCTOR_ID, FECHA_ASIGNACION) VALUES (?, ?, ?)";
        
        try (Connection conn = DBManager.getInstance().obtenerConexion()) {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, vehiculo.getVehiculoId()); // Asigna el ID del vehículo
            ps.setInt(2, conductor.getConductorId()); // Asigna el ID del conductor
            ps.setDate(3, (java.sql.Date) fechaAsignacion); // Asigna la fecha de asignación
            ps.executeUpdate(); // Ejecuta la inserción
        } 
    }

    @Override
    public int agregar(VehiculoConductor entidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public VehiculoConductor obtenerPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<VehiculoConductor> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int actualizar(VehiculoConductor entidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int eliminar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
