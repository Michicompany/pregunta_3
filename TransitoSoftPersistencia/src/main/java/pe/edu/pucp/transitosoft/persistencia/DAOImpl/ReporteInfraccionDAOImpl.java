/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.transitosoft.persistencia.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pe.edu.pucp.transitosoft.dbmanager.DBManager;
import pe.edu.pucp.transitosoft.dominio.RegistroInfraccion;
import pe.edu.pucp.transitosoft.dominio.ReporteInfraccion;
import pe.edu.pucp.transitosoft.persistencia.DAO.RegistroInfraccionDAO;
import pe.edu.pucp.transitosoft.persistencia.DAO.ReporteInfraccionDAO;

/**
 *
 * @author Usuario
 */
public class ReporteInfraccionDAOImpl  implements ReporteInfraccionDAO {
    private Connection con;
    private ResultSet rs;
    
//    @Override
//    public int registrarInfraccion(ReporteInfraccion reporte){
//        try {
//            DBManager.getInstance().iniciarTransaccion();
//            Map<Integer,Object> parametrosSalida = new HashMap<>();
//            Map<Integer,Object> parametrosEntrada = new HashMap<>();
//            parametrosSalida.put(1, Types.INTEGER);
//
//            parametrosEntrada.put(2, reporte.getConductor().getConductorId());
//            parametrosEntrada.put(3, reporte.getConductor().getPaterno());
//            parametrosEntrada.put(4, reporte.getConductor().getMaterno());
//            parametrosEntrada.put(5, reporte.getConductor().getNombres());
//            parametrosEntrada.put(6, reporte.getVehiculo().getVehiculoId());
//            parametrosEntrada.put(7, reporte.getVehiculo().getPlaca());
//            parametrosEntrada.put(8, reporte.getVehiculo().getMarca());
//            parametrosEntrada.put(9, reporte.getVehiculo().getModelo());
//            parametrosEntrada.put(10, reporte.getVehiculo().getAnho());
//            parametrosEntrada.put(11, reporte.getInfraccion().getInfraccionId());
//            parametrosEntrada.put(12, reporte.getInfraccion().getDescripcion());
//            parametrosEntrada.put(13, reporte.getInfraccion().getMontoMulta());
//            parametrosEntrada.put(14, reporte.getInfraccion().getGravedad());
//
//            DBManager.getInstance().ejecutarProcedimiento("INSERTAR_REGISTRO_INFRACCION", parametrosEntrada, parametrosSalida);
//            reporte.setReporteId((int) parametrosSalida.get(1));
//            DBManager.getInstance().confirmarTransaccion();
//            System.out.println("Se ha realizado el registro de la infracción");
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//            DBManager.getInstance().cancelarTransaccion();
//        }finally{
//            DBManager.getInstance().cerrarConexion();
//        }
//
//        return reporte.getReporteId();
//    }

    @Override
    public int agregar(ReporteInfraccion reporte) {
        try {
            DBManager.getInstance().iniciarTransaccion();
            Map<Integer,Object> parametrosSalida = new HashMap<>();
            Map<Integer,Object> parametrosEntrada = new HashMap<>();
            parametrosSalida.put(1, Types.INTEGER);

            parametrosEntrada.put(2, reporte.getConductor().getConductorId());
            parametrosEntrada.put(3, reporte.getConductor().getPaterno());
            parametrosEntrada.put(4, reporte.getConductor().getMaterno());
            parametrosEntrada.put(5, reporte.getConductor().getNombres());
            parametrosEntrada.put(6, reporte.getVehiculo().getVehiculoId());
            parametrosEntrada.put(7, reporte.getVehiculo().getPlaca());
            parametrosEntrada.put(8, reporte.getVehiculo().getMarca());
            parametrosEntrada.put(9, reporte.getVehiculo().getModelo());
            parametrosEntrada.put(10, reporte.getVehiculo().getAnho());
            parametrosEntrada.put(11, reporte.getInfraccion().getInfraccionId());
            parametrosEntrada.put(12, reporte.getInfraccion().getDescripcion());
            parametrosEntrada.put(13, reporte.getInfraccion().getMontoMulta());
            parametrosEntrada.put(14, reporte.getInfraccion().getGravedad());

            DBManager.getInstance().ejecutarProcedimiento("INSERTAR_REGISTRO_INFRACCION", parametrosEntrada, parametrosSalida);
            reporte.setReporteId((int) parametrosSalida.get(1));
            DBManager.getInstance().confirmarTransaccion();
            System.out.println("Se ha realizado el registro de la infracción");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            DBManager.getInstance().cancelarTransaccion();
        }finally{
            DBManager.getInstance().cerrarConexion();
        }

        return reporte.getReporteId();
    }

    @Override
    public ReporteInfraccion obtenerPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ReporteInfraccion> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int actualizar(ReporteInfraccion entidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int eliminar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 

}
