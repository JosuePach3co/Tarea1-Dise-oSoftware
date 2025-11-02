package proyecto.tarea1_disenosoftware.services;

import proyecto.tarea1_disenosoftware.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GestorFunciones {

    // listas simples para cumplir el diagrama (puedes adaptarlas a tu código real)
    private final List<Sala> salas;
    private final List<Funcion> funciones;

    public GestorFunciones(List<Sala> salas, List<Funcion> funciones) {
        this.salas = salas;
        this.funciones = funciones;
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
    public void modificarDatos(String idFuncion, LocalDateTime nuevaFecha) {
        for (Funcion f : funciones) {
            if (f.getId().equals(idFuncion)) {
                f.actualizarDatos(nuevaFecha);
                break;
            }
        }
    }

    // ==== Caso 2: loop por tipo de asiento en todas las funciones ====
    public void aplicarTarifaATipo(TipoAsiento tipo, double nuevaTarifa) {
        for (Funcion f : funciones) {
            f.aplicarTarifa(tipo, nuevaTarifa);
        }
    }
}
