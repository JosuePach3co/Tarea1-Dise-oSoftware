
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

    private List<Reporte> reportesAsignados;

    public AgenteSoporte() {
        this.reportesAsignados = new ArrayList<>();
    }
       

    @Override
    public void atenderReporte(Reporte reporte) {
        // Lógica para atender
    }

    @Override
    public void escalarReporte(Reporte reporte) {
        // Lógica para escalar
    }

    public List<Reporte> getReportesAsignados() {
        return reportesAsignados;
    }

    public void setReportesAsignados(List<Reporte> reportesAsignados) {
        this.reportesAsignados = reportesAsignados;
    }
    
    
}
