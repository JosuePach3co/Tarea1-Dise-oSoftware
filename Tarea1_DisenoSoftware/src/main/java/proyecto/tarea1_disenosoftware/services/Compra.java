
package proyecto.tarea1_disenosoftware.services;

import java.util.ArrayList;
import java.util.List;
import proyecto.tarea1_disenosoftware.Asiento;
import proyecto.tarea1_disenosoftware.users.Usuario;

/**
 *
 * @author pc
 */
public class Compra {
    private int idCompra;
    private Usuario usuario;
    private List<Asiento> asientos;
    
    public Compra(){
        this.asientos = new ArrayList<>();
    }
    
    public Compra(Usuario usuario) {
        this.usuario = usuario;
        this.asientos = new ArrayList<>();
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(List<Asiento> asientos) {
        this.asientos = asientos;
    }
    
    
        
        
    
}
