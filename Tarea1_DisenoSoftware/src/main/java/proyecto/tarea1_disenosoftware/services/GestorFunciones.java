package proyecto.tarea1_disenosoftware.services;

import java.util.ArrayList;
import java.util.List;
import proyecto.tarea1_disenosoftware.Funcion;
import proyecto.tarea1_disenosoftware.users.Usuario;

public class GestorFunciones {

    public boolean modificarFuncion(Funcion funcion, java.util.Date nuevaHora) {
        if (funcion == null || nuevaHora == null) {
            return false;
        }
        if (nuevaHora.before(new java.util.Date())) {
            System.out.println("[GestorFunciones] Hora inválida: en el pasado.");
            return false;
        }
        funcion.setHora(nuevaHora);
        System.out.println("[GestorFunciones] Funcion actualizada a: " + nuevaHora);
        return true;
    }

    public List<Usuario> obtenerUsuariosAfectados(Funcion funcion) {
        List<Usuario> lista = new ArrayList<>();
        // Simulamos usuarios; puedes extender para setear emails, etc.
        lista.add(new Usuario());
        lista.add(new Usuario());
        return lista;
    }
}