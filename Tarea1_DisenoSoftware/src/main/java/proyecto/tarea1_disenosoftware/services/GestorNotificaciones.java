package proyecto.tarea1_disenosoftware.services;

import proyecto.tarea1_disenosoftware.interfaces.Notificador;
import proyecto.tarea1_disenosoftware.users.Usuario;

public class GestorNotificaciones implements Notificador {
    @Override
    public void enviarNotificacion(Usuario usuario, String mensaje) {
        System.out.println("📩 Notificación a " + usuario.getCorreo() + ": " + mensaje);
    }
}
