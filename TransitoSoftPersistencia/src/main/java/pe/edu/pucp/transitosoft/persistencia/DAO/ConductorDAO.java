
package pe.edu.pucp.transitosoft.persistencia.DAO;

import pe.edu.pucp.transitosoft.dominio.Conductor;
import pe.edu.pucp.transitosoft.enums.Gravedad;

/**
 *
 * @author Usuario
 */
public interface ConductorDAO extends BaseDAO<Conductor>{
    //metodos especificos
    
    public int obtenerPuntos(int conductorId, Gravedad gravedad);//cómo llamo un enum?
    //public int agregarConductor(Conductor conductor);
}
