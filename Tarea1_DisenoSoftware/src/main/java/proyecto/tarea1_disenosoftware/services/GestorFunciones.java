package proyecto.tarea1_disenosoftware.services;

import proyecto.tarea1_disenosoftware.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import proyecto.tarea1_disenosoftware.users.Usuario;

public class GestorFunciones {

    // listas simples para cumplir el diagrama (puedes adaptarlas a tu código real)
    private List<Sala> salas; 
    private List<Funcion> funciones;
    private List<Usuario> lstaUsuariosAfectados;
    
    public GestorFunciones() {
      this.salas = new ArrayList<>();
      this.funciones = new ArrayList<>();
      this.lstaUsuariosAfectados = new ArrayList<>();
    }
    

    // ==== Lo que "ve" el admin (listar funciones y salas) ====
    public List<String> listarFuncionesYSalas() {
        List<String> out = new ArrayList<>();
        for (Funcion f : funciones) {
            out.add("Función " + f.getId() + " @ " + f.getSala().getNombre());
        }
        return out;
    }

    // ==== Caso 2: self-call en Funcion ====
    public boolean modificarDatos(String idFuncion, LocalDateTime nuevaFecha) {
        for (Funcion f : funciones) {
            if (f.getId().equals(idFuncion)) {
                f.actualizarDatos(nuevaFecha);
                return true;
            }
        }
        return false;
    }

    // ==== Caso 2: loop por tipo de asiento en todas las funciones ====
    public void aplicarTarifaATipo(TipoAsiento tipo, double nuevaTarifa) {
        for (Funcion f : funciones) {
            f.aplicarTarifa(tipo, nuevaTarifa);
        }
    }
    
    public List<Usuario> getListaUsuarioAfectados() {
        return this.lstaUsuariosAfectados;
    }

}
