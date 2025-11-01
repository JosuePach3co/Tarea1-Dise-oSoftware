
package proyecto.tarea1_disenosoftware.users;

import proyecto.tarea1_disenosoftware.Funcion;
import proyecto.tarea1_disenosoftware.interfaces.GestionInventario;
import proyecto.tarea1_disenosoftware.interfaces.Notificador;

/**
 *
 * @author pc
 */

public class Administrador implements GestionInventario {
    
    private Notificador notificador;

    public Administrador(Notificador notificador) {
        this.notificador = notificador;
    }

    @Override
    public void gestionarFunciones(Funcion funcion) {
        // Logica para gestionar funciones
    }

    @Override
    public void configurarPrecios(String tipo, double precio) {
        // Logica para configurar precios
    }
    
    public void notificarCambios(Usuario usuario, String mensaje) {
        // El administrador usa el notificador
        this.notificador.enviarNotificacion(usuario, mensaje);
    }
}