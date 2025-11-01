
package proyecto.tarea1_disenosoftware;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class Sala {
    private int numero;
    private Object mapaInteractivo; //no se sabe que puede ser un mapa interactivo, por el momento queda asi
    private List<Asiento> asientos;

    public Sala(int numero) {
        this.numero = numero;
        this.asientos = new ArrayList<>();
        //logica para iniciar el mapa por el momento
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Object getMapaInteractivo() {
        return mapaInteractivo;
    }

    public void setMapaInteractivo(Object mapaInteractivo) {
        this.mapaInteractivo = mapaInteractivo;
    }
    
}
