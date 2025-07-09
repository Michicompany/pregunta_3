
package pe.edu.pucp.transitosoftws.resources;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.xml.ws.WebServiceException;
import java.util.List;
import pe.edu.pucp.transitosoft.dominio.Conductor;
import pe.edu.pucp.transitosoft.enums.Gravedad;
import pe.edu.pucp.transitosoftbo.ConductorBO;

/**
 *
 * @author Usuario
 */
@WebService(serviceName = "ConductorWS", targetNamespace = "pe.edu.pucp.transitosoft")
public class ConductorWS {
    private ConductorBO conductorBO ;
    
    public ConductorWS(){
        conductorBO = new ConductorBO();
    }
    @WebMethod(operationName = "insertar")
    public void insertar(Conductor conductor) {
        try {
            conductorBO.insertar(conductor);
        }catch(Exception ex){
            throw new WebServiceException("Error al insertar conductores"+ex.getMessage()) ;
        }
    }
    @WebMethod(operationName = "obtenerPuntos")
    public int obtenerPuntos(@WebParam(name = "id") int conductorId, Gravedad gravedad) {
        try{
            return conductorBO.obtenerPuntos(conductorId, gravedad);
        }catch(Exception ex){
            throw new WebServiceException("Error al obtener puntos "+ex.getMessage()) ;
        }
    }
    @WebMethod(operationName = "listarTodos")
    public List<Conductor> listarTodos() {
        try{
            return conductorBO.listarTodos();
        }catch(Exception ex){
            throw new WebServiceException("Error al listar conductores "+ex.getMessage()) ;
        }
    }
    @WebMethod(operationName = "obtenerPorId")
    public Conductor obtenerPorId(@WebParam(name = "id") int conductorId) {
        try{
            return conductorBO.obtenerPorId(conductorId);
        }catch(Exception ex){
            throw new WebServiceException("Error al obtener conductor "+ex.getMessage()) ;
        }
    }
}
