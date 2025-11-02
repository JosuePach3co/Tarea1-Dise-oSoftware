package proyecto.tarea1_disenosoftware;

import java.util.Date;
import java.util.List;
import proyecto.tarea1_disenosoftware.services.GestorFunciones;
import proyecto.tarea1_disenosoftware.services.GestorNotificaciones;
import proyecto.tarea1_disenosoftware.users.Usuario;

public class Sistema {

    private GestorFunciones gestorFunciones;
    private GestorNotificaciones gestorNotificaciones;

    public Sistema() {
        this.gestorFunciones = new GestorFunciones();
        this.gestorNotificaciones = new GestorNotificaciones();
    }

    public boolean modificarFuncionYNotificar(Funcion funcion, Date nuevaHora) {
        boolean exito = gestorFunciones.modificarFuncion(funcion, nuevaHora);
        if (!exito) {
            System.out.println("[Sistema] No se pudo actualizar la función.");
            return false;
        }

        List<Usuario> afectados = gestorFunciones.obtenerUsuariosAfectados(funcion);
        for (Usuario u : afectados) {
            gestorNotificaciones.enviarNotificacion(u, "La función fue reprogramada a: " + nuevaHora);
        }
        return true;
    }
}

