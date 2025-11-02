package proyecto.tarea1_disenosoftware;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
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
        LocalDateTime nuevaFechaHora = nuevaHora.toInstant()
                                                .atZone(ZoneId.systemDefault())
                                                .toLocalDateTime();
        String idDeLaFuncion = funcion.getId();
        boolean exito = gestorFunciones.modificarDatos(idDeLaFuncion, nuevaFechaHora);
        if (!exito) {
            System.out.println("[Sistema] No se pudo actualizar la función.");
            return false;
        }

        List<Usuario> afectados = gestorFunciones.getListaUsuarioAfectados();

        for (Usuario u : afectados) {
            gestorNotificaciones.enviarNotificacion(u, "La función fue reprogramada a: " + nuevaHora);
        }
        return true;
    }
}


