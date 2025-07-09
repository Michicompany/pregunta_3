
package pe.edu.pucp.transitosoft.persistencia.DAO;

import java.sql.SQLException;
import java.util.Date;
import pe.edu.pucp.transitosoft.dominio.Conductor;
import pe.edu.pucp.transitosoft.dominio.Vehiculo;
import pe.edu.pucp.transitosoft.dominio.VehiculoConductor;

/**
 *
 * @author Usuario
 */
public interface VehiculoConductorDAO extends BaseDAO<VehiculoConductor> {
    public void insertarRelacion(Vehiculo vehiculo, Conductor conductor, Date fechaAsignacion) throws SQLException;
}
