
package proyecto.tarea1_disenosoftware.interfaces;

import proyecto.tarea1_disenosoftware.users.Usuario;

/**
 *
 * @author pc
 */
// Principio de Inversión de Dependencias (DIP)
// Cualquier clase que necesite notificar ( GestorPagos, Administrador)
// dependerá de esta interfaz, no de una implementación concreta.
public interface Notificador {
    public void enviarNotificacion(Usuario usuario, String mensaje);
}
