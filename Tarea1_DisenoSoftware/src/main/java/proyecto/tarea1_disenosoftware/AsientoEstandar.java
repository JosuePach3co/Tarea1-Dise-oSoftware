
package proyecto.tarea1_disenosoftware;

/**
 *
 * @author pc
 */
public class AsientoEstandar extends Asiento {
    
    @Override
    public double getPrecio() {
        return 10.0; 
    }

    @Override
    public String getDescripcion() {
        return "Asiento Estándar";
    }
}
