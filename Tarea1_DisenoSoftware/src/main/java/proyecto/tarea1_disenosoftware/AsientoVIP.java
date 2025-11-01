
package proyecto.tarea1_disenosoftware;

/**
 *
 * @author pc
 */
public class AsientoVIP extends Asiento {
    
    @Override
    public double getPrecio() {
        return 20.0; 
    }

    @Override
    public String getDescripcion() {
        return "Asiento VIP";
    }
}
