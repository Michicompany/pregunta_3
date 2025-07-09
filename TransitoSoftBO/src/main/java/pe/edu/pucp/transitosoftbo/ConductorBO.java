
package pe.edu.pucp.transitosoftbo;

import java.util.List;
import pe.edu.pucp.transitosoft.dominio.Conductor;
import pe.edu.pucp.transitosoft.enums.Gravedad;
import pe.edu.pucp.transitosoft.persistencia.DAO.ConductorDAO;
import pe.edu.pucp.transitosoft.persistencia.DAOImpl.ConductorDAOImpl;

/**
 *
 * @author Usuario
 */
public class ConductorBO {
    private ConductorDAO conductorDAO;
    
    public ConductorBO(){
        conductorDAO = new ConductorDAOImpl();
    }
    
    public int insertar(Conductor conductor){
        return conductorDAO.agregar(conductor);
    }
    public int obtenerPuntos(int conductorId, Gravedad gravedad){
        
        return conductorDAO.obtenerPuntos(conductorId,gravedad);
    }
    
    public List<Conductor>  listarTodos(){
        return conductorDAO.listarTodos();
    }
    
    public Conductor obtenerPorId(int id){
        return conductorDAO.obtenerPorId(id);
    }
}
