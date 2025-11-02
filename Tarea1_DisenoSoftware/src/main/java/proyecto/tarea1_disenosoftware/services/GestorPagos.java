package proyecto.tarea1_disenosoftware.services;

import proyecto.tarea1_disenosoftware.Asiento;
import proyecto.tarea1_disenosoftware.EstadoAsiento;

import java.util.*;

public class GestorPagos {

    // Sesión -> lista de asientos bloqueados
    private final Map<String, List<Asiento>> bloqueosPorSesion = new HashMap<>();

    // ==== Fase B de tu diagrama: iniciar temporizador y bloquear asientos ====
    public void iniciarTemporizador(String sesionId, List<Asiento> asientos, int segundos) {
        for (Asiento a : asientos) a.marcarEnProceso();
        bloqueosPorSesion.put(sesionId, new ArrayList<>(asientos));

        new java.util.Timer(true).schedule(new java.util.TimerTask() {
            @Override public void run() { liberarAsientosPorTimeout(sesionId); }
        }, segundos * 1000L);
    }

    // ==== Confirmación de compra: pago aprobado/rechazado ====
    public boolean procesarPago(String tarjeta, double total) {
        // Simulación: tarjetas que TERMINAN en '0' => rechazo
        return tarjeta != null && !tarjeta.endsWith("0");
    }

    // ==== Utilidades para liberar ====
    public void liberarAsientos(List<Asiento> asientos) {
        for (Asiento a : asientos) a.marcarDisponible();
    }

    public void liberarAsientosPorTimeout(String sesionId) {
        List<Asiento> lista = bloqueosPorSesion.remove(sesionId);
        if (lista == null) return;
        for (Asiento a : lista) {
            if (a.getEstado() == EstadoAsiento.EN_PROCESO) a.marcarDisponible();
        }
        System.out.println("[GP] Tiempo agotado. Asientos liberados. Sesión: " + sesionId);
    }
}
