
package proyecto.tarea1_disenosoftware.interfaces;

import proyecto.tarea1_disenosoftware.Funcion;

/**
 *
 * @author pc
 */
// Principio de Segregación de Interfaces (ISP)
// Interfaz específica para roles de Administrador.
public interface GestionInventario {
    public void gestionarFunciones(Funcion funcion);
    public void configurarPrecios(String tipo, double precio);
}