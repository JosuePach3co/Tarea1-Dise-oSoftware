package proyecto.tarea1_disenosoftware.services;

import proyecto.tarea1_disenosoftware.Reporte;
import proyecto.tarea1_disenosoftware.users.AgenteSoporte;

public class GestorProblemas {

    private int siguienteId = 1;

    public Reporte registrarReporte(String descripcion) {
        Reporte r = new Reporte(descripcion);
        r.setIdReporte("R-" + (siguienteId++));
        System.out.println("[GestorProblemas] Reporte registrado: " + r.getIdReporte());
        return r;
    }

    public boolean asignarYAtenderReporte(Reporte r, AgenteSoporte agente) {
        System.out.println("[GestorProblemas] Asignando reporte " + r.getIdReporte() + " al agente.");
        // Usamos el método nuevo (no invasivo) de AgenteSoporte que devuelve boolean
        boolean resuelto = agente.atenderReporteYResolver(r);
        if (!resuelto) {
            escalarReporte(r);
        }
        return resuelto;
    }

    public void escalarReporte(Reporte r) {
        System.out.println("[GestorProblemas] Escalando reporte " + r.getIdReporte() + " al equipo admin sala.");
    }

    
}
