
package proyecto.tarea1_disenosoftware.interfaces;

import proyecto.tarea1_disenosoftware.Reporte;

/**
 *
 * @author pc
 */
// Principio de Segregación de Interfaces (ISP)
// Interfaz específica para roles de Soporte.
public interface GestionSoporte {
    public void atenderReporte(Reporte reporte);
    public void escalarReporte(Reporte reporte);
}
