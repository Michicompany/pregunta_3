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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pe.edu.pucp.transitosoft.dbmanager.DBManager;
import pe.edu.pucp.transitosoft.dominio.Conductor;
import pe.edu.pucp.transitosoft.dominio.TipoLicencia;
import pe.edu.pucp.transitosoft.enums.Gravedad;
import pe.edu.pucp.transitosoft.persistencia.DAO.ConductorDAO;

/**
 *
 * @author Usuario
 */
public class ConductorDAOImpl implements ConductorDAO {
    private final TipoLicenciaDAOImpl tipoLicenciaDAO;
    private ResultSet rs;
    private Connection conn;
    public ConductorDAOImpl() {
        this.tipoLicenciaDAO = new TipoLicenciaDAOImpl();
        //this.empleadoDAO = new EmpleadoDAOImpl();
    }
    

    @Override
    public int obtenerPuntos(int conductorId, Gravedad gravedad) {
        //Area area = null;
        Map<Integer, Object> parametrosEntrada = new HashMap<>();
        Map<Integer, Object> parametrosSalida = new HashMap<>();
        parametrosEntrada.put(1, conductorId);
        parametrosEntrada.put(2, gravedad);
        parametrosSalida.put(3, Types.INTEGER);
        System.out.println("obteniendo puntos...");
        int puntos = DBManager.getInstance().ejecutarProcedimiento("preg2_obtenerPuntosConductor", parametrosEntrada,parametrosSalida);
        System.out.println("puntos obtenidos"+ puntos);
        return puntos;
    }
    //EMPLEANDO CS
    @Override
    public List<Conductor>  listarTodos(){
        ArrayList<Conductor> conductores = null;
        rs = DBManager.getInstance().ejecutarProcedimientoLectura("LISTARCONDUCTORESTODOS", null);
        System.out.println("Lectura de conductores...");
        try{
            while(rs.next()){
                if(conductores == null) conductores = new ArrayList<>();
                Conductor conductor = new Conductor();
                conductor.setConductorId(rs.getInt("conductor_id"));
               conductor.setPaterno(rs.getString("paterno"));
               if(rs.getString("materno")!=null)
                   conductor.setMaterno(rs.getString("materno"));
               else conductor.setMaterno("");
               conductor.setNombres(rs.getString("nombres"));
               conductor.setNumLicencia(rs.getString("num_licencia"));
               TipoLicencia tipoLicencia = new TipoLicencia();
                tipoLicencia.setTipoLicenciaId(rs.getInt("tipo_licencia_id"));
                tipoLicencia.setNombre(rs.getString("tipo_licencia_nombre"));
                tipoLicencia.setDescripcion(rs.getString("tipo_licencia_descripcion"));
                conductor.setTipoLicencia(tipoLicencia);
                conductor.setPuntosAcumulados(rs.getInt("puntos_acumulados"));
                conductor.setTipoLicencia(tipoLicencia);
                conductores.add(conductor);
            }
            
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            
        }finally{
            DBManager.getInstance().cerrarConexion();
        }
        return conductores;
    }
    
    @Override
    public Conductor obtenerPorId(Integer idConductor) {
        Conductor conductor = null;
        Map<Integer, Object> parametrosEntrada = new HashMap<>();
        parametrosEntrada.put(1, idConductor);
        rs = DBManager.getInstance().ejecutarProcedimientoLectura("OBTENER_CONDUCTOR_X_ID", parametrosEntrada);
        System.out.println("Lectura de conductor...");
        try{
            if(rs.next()){
               conductor = new Conductor();
                conductor.setConductorId(rs.getInt("conductor_id"));
               conductor.setPaterno(rs.getString("paterno"));
               if(rs.getString("materno")!=null)
                   conductor.setMaterno(rs.getString("materno"));
               else conductor.setMaterno("");
               conductor.setNombres(rs.getString("nombres"));
               conductor.setNumLicencia(rs.getString("num_licencia"));
               TipoLicencia tipoLicencia = new TipoLicencia();
                tipoLicencia.setTipoLicenciaId(rs.getInt("tipo_licencia_id"));
                tipoLicencia.setNombre(rs.getString("tipo_licencia_nombre"));
                tipoLicencia.setDescripcion(rs.getString("tipo_licencia_descripcion"));
                conductor.setTipoLicencia(tipoLicencia);
                conductor.setPuntosAcumulados(rs.getInt("puntos_acumulados"));
                conductor.setTipoLicencia(tipoLicencia);
                
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            
        }finally{
            DBManager.getInstance().cerrarConexion();
        }
        return conductor;
    }
//        this.nombres = nombres;
//        this.paterno = paterno;
//        this.materno = materno;
//        this.numLicencia = numLicencia;
//        this.tipoLicencia = tipoLicencia;
//        this.puntosAcumulados = puntosAcumulados;
    @Override
    public int agregar(Conductor conductor) {
       
       
        Map<Integer,Object> parametrosSalida = new HashMap<>();
        Map<Integer,Object> parametrosEntrada = new HashMap<>();
        parametrosSalida.put(1, Types.INTEGER);
        parametrosEntrada.put(2, conductor.getNombres());
        parametrosEntrada.put(3, conductor.getPaterno());
        parametrosEntrada.put(4, conductor.getMaterno());// válido si el SP acepta null
        
        parametrosEntrada.put(5, conductor.getNumLicencia());
        parametrosEntrada.put(6, conductor.getPuntosAcumulados());
        parametrosEntrada.put(7, conductor.getTipoLicencia().getTipoLicenciaId());
        DBManager.getInstance().ejecutarProcedimiento("INSERTAR_CONDUCTOR", parametrosEntrada, parametrosSalida);
        conductor.setConductorId((int) parametrosSalida.get(1));

        //si quito el commit entonces el valor nunca se actualiza en la bd y eso da la falsa ilusion de que
        //si hay id pero realmente no hay
        System.out.println("Se ha realizado el registro del conductor");


        return conductor.getConductorId();
    }

    @Override
    public int actualizar(Conductor conductor) {
        Map<Integer,Object> parametrosEntrada = new HashMap<>();
        parametrosEntrada.put(1,conductor.getConductorId());
        parametrosEntrada.put(2, conductor.getNombres());
        parametrosEntrada.put(3, conductor.getPaterno());
        parametrosEntrada.put(4, conductor.getMaterno());
        parametrosEntrada.put(5, conductor.getNumLicencia());
        parametrosEntrada.put(6, conductor.getTipoLicencia().getTipoLicenciaId());
        parametrosEntrada.put(7, conductor.getPuntosAcumulados());
        int resultado = DBManager.getInstance().ejecutarProcedimiento("MODIFICAR_CONDUCTOR", parametrosEntrada, null);
        System.out.println("Se ha realizado la modificacion del conductor");
        return resultado;
    }

    @Override
    public int eliminar(Integer id) {
        Map<Integer,Object> parametrosEntrada = new HashMap<>();
        parametrosEntrada.put(1, id);
        int resultado = DBManager.getInstance().ejecutarProcedimiento("ELIMINAR_CONDUCTOR", parametrosEntrada, null);
        System.out.println("Se ha realizado la eliminacion del conductor");
        return resultado;
    }
}
