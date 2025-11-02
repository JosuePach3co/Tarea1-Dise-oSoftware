package proyecto.tarea1_disenosoftware.interfaces;

import proyecto.tarea1_disenosoftware.users.Usuario;

public interface Notificador {
    void enviarNotificacion(Usuario usuario, String mensaje);
}
