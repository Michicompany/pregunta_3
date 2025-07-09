/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pe.edu.pucp.transitosoft.persistencia.DAO;

import java.util.List;

public interface BaseDAO<T> {
    int agregar(T entidad);
    T obtenerPorId(Integer id);
    List<T> listarTodos();
    int actualizar(T entidad);
    int eliminar(Integer id);
    
//    int agregar(T entidad);
//    int actualizar(T entidad);
//    int eliminar(Integer id);
}