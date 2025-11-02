package proyecto.tarea1_disenosoftware.services;

import proyecto.tarea1_disenosoftware.*;
import proyecto.tarea1_disenosoftware.interfaces.Notificador;
import proyecto.tarea1_disenosoftware.users.Usuario;

import java.util.List;

public class Compra {

    private final GestorPagos gestorPagos;
    private final Notificador notificador;

    public Compra(GestorPagos gestorPagos, Notificador notificador) {
        this.gestorPagos = gestorPagos;
        this.notificador = notificador;
    }

    // ==== Selección y bloqueo (fase B) ====
    public void seleccionarAsientos(String sesionId, Funcion funcion, List<String> ids, int segundos) {
        List<Asiento> seleccion = funcion.getSala().getAsientosPorId(ids);
        gestorPagos.iniciarTemporizador(sesionId, seleccion, segundos); // marca EN_PROCESO y programa timeout
    }

    // ==== Confirmación de compra (alt aprobado / alt rechazado) ====
    public boolean confirmarCompra(Usuario u, Funcion funcion, List<String> ids, String tarjeta) {
        List<Asiento> seleccion = funcion.getSala().getAsientosPorId(ids);

        double total = 0.0;
        for (Asiento a : seleccion) {
            total += funcion.tarifaDe(a.getTipo());
        }

        boolean ok = gestorPagos.procesarPago(tarjeta, total);
        if (ok) {
            for (Asiento a : seleccion) a.marcarReservado(); // loop reservar
            notificador.enviarNotificacion(u, "Compra confirmada");
            return true;
        } else {
            gestorPagos.liberarAsientos(seleccion); // alt rechazo
            notificador.enviarNotificacion(u, "Pago rechazado");
            return false;
        }
    }
}
