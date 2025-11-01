
package proyecto.tarea1_disenosoftware;

/**
 *
 * @author pc
 */
public class Reporte {
    private String idReporte;
    private String descripcion;

    public Reporte(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(String idReporte) {
        this.idReporte = idReporte;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
