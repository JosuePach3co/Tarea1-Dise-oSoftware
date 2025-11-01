
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
        System.out.println("Enviando a " + usuario + ": " + mensaje);
    }
}
