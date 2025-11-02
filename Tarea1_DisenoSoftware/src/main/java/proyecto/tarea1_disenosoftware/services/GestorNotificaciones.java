
package proyecto.tarea1_disenosoftware.services;

import proyecto.tarea1_disenosoftware.interfaces.Notificador;
import proyecto.tarea1_disenosoftware.users.Usuario;

/**
 *
 * @author pc
 */

public class GestorNotificaciones implements Notificador {
    private Object emailSender;
    private Object appSender;

    @Override
    public void enviarNotificacion(Usuario usuario, String mensaje) {
        if (usuario == null) {
            System.out.println("[GestorNotificaciones] Usuario nulo: " + mensaje);
            return;
        }
        System.out.println("[Notificación] A usuario: " + mensaje);
    }
}