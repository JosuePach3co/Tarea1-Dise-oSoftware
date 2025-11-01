
package proyecto.tarea1_disenosoftware.services;

import java.util.Timer;
import proyecto.tarea1_disenosoftware.interfaces.Notificador;

/**
 *
 * @author pc
 */
public class GestorPagos {

    private Timer tiempoLimite;
    
    private Notificador notificador;

    public GestorPagos(Notificador notificador) {
        this.notificador = notificador;
    }

    public boolean procesarPago(double monto) {
        // Lógica de pago
        boolean pagoExitoso = true; 
        
        if (!pagoExitoso) {
            notificador.enviarNotificacion(null, "Pago fallido");
        }
        return pagoExitoso;
    }

    public void iniciarTemporizador() {
        // Lógica para iniciar el timer
    }

    public void liberarAsientos() {
        // Lógica para obtener los asientos.

    }

    public Timer getTiempoLimite() {
        return tiempoLimite;
    }

    public void setTiempoLimite(Timer tiempoLimite) {
        this.tiempoLimite = tiempoLimite;
    }

    public Notificador getNotificador() {
        return notificador;
    }

    public void setNotificador(Notificador notificador) {
        this.notificador = notificador;
    }
    
    
}