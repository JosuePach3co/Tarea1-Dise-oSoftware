
package proyecto.tarea1_disenosoftware;

import java.util.List;

/**
 *
 * @author pc
 */
public class Boleto {
    private String idBoleto;
    private Funcion funcion;
    
    private List<Asiento> asientosAsignados;

    public Boleto() {
    }

    public Boleto(String idBoleto, Funcion funcion, List asientosAsignados) {
        this.idBoleto = idBoleto;
        this.funcion = funcion;
        this.asientosAsignados = asientosAsignados;
    }
    
    

    public String getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(String idBoleto) {
        this.idBoleto = idBoleto;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public List getAsientosAsignados() {
        return asientosAsignados;
    }

    public void setAsientosAsignados(List asientosAsignados) {
        this.asientosAsignados = asientosAsignados;
    }

    
}
