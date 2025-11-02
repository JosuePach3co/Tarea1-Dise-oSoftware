package proyecto.tarea1_disenosoftware;

import proyecto.tarea1_disenosoftware.services.GestorProblemas;
import proyecto.tarea1_disenosoftware.users.AgenteSoporte;

public class TestSoporte {
    public static void main(String[] args) {
        GestorProblemas gestor = new GestorProblemas();
        AgenteSoporte agente = new AgenteSoporte();

        Reporte r = gestor.registrarReporte("No puedo completar la compra con mi tarjeta.");
        gestor.asignarYAtenderReporte(r, agente);
    }
}

