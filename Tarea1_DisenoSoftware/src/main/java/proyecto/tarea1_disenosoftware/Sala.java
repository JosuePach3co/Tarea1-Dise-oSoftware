package proyecto.tarea1_disenosoftware;

import java.util.*;
import java.util.stream.Collectors;

public class Sala {
    private final String nombre;              
    private final List<Asiento> asientos;

    public Sala(String nombre, List<Asiento> asientos) {
        this.nombre = nombre;
        this.asientos = asientos;
    }

    public String getNombre() { return nombre; }
    public List<Asiento> getAsientos() { return asientos; }

    // ==== usado por tu diagrama (plano con disponibilidad) ====
    public Map<String, String> mapaInteractivo() {
        return asientos.stream().collect(Collectors.toMap(
                Asiento::getId,
                a -> a.getEstado().name()
        ));
    }

    // helper: recuperar por ids
    public List<Asiento> getAsientosPorId(List<String> ids) {
        List<Asiento> out = new ArrayList<>();
        for (String id : ids) {
            for (Asiento a : asientos) {
                if (a.getId().equals(id)) { out.add(a); break; }
            }
        }
        return out;
    }
}
