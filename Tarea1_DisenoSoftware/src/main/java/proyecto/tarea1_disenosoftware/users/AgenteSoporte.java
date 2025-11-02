
package proyecto.tarea1_disenosoftware.users;

import java.util.ArrayList;
import java.util.List;
import proyecto.tarea1_disenosoftware.Reporte;
import proyecto.tarea1_disenosoftware.interfaces.GestionSoporte;

/**
 *
 * @author pc
 */
public class AgenteSoporte implements GestionSoporte {

    private List<Reporte> reportes;

    public AgenteSoporte() {
        this.reportes = new ArrayList<>();
    }
       

    @Override
    public void atenderReporte(Reporte reporte) {
        // Lógica para atender
         atenderReporteYResolver(reporte);
    }

    public boolean atenderReporteYResolver(Reporte reporte) {
        System.out.println("[AgenteSoporte] Atendiendo reporte: " + reporte.getDescripcion());
        boolean resuelto = (reporte.getDescripcion() != null) && (reporte.getDescripcion().length() % 2 == 0);
        if (resuelto) {
            System.out.println("[AgenteSoporte] Reporte resuelto.");
        } else {
            System.out.println("[AgenteSoporte] No pudo resolver el reporte, se deberá escalar.");
        }
        return resuelto;
    }


    @Override
    public void escalarReporte(Reporte reporte) {
        System.out.println("[AgenteSoporte] Escalando reporte: " + reporte.getIdReporte());
    }

    public List<Reporte> getReportesAsignados() {
        return reportes;
    }

    public void setReportesAsignados(List<Reporte> reportesAsignados) {
        this.reportes = reportesAsignados;
    }
    
    
}
