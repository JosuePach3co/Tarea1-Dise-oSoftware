
package proyecto.tarea1_disenosoftware;

/**
 *
 * @author pc
 */
// Principio Abierto/Cerrado (OCP)
// Esta clase es abstracta cerrada a modificacion pero abierta a extension
public abstract class Asiento {
    
    private String id;
    private EstadoAsiento estado;
    
    public abstract double getPrecio();
    public abstract String getDescripcion();

    // SRP: solo gestiona su estado
    public void marcarEnProceso() {
        this.estado = EstadoAsiento.EN_PROCESO_COMPRA;
    }

    public void marcarReservado() {
        this.estado = EstadoAsiento.RESERVADO;
    }

    public void marcarDisponible() {
        this.estado = EstadoAsiento.DISPONIBLE;
    }

    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EstadoAsiento getEstado() {
        return estado;
    }

    public void setEstado(EstadoAsiento estado) {
        this.estado = estado;
    }
       
   
}
