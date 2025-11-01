
package proyecto.tarea1_disenosoftware;

import java.util.Date;

/**
 *
 * @author pc
 */
public class Funcion {
    private Date hora;
    private Sala sala;

    public Funcion(Sala sala, Date hora) {
        this.sala = sala;
        this.hora = hora;
    }

    public Sala getSala() {
        return sala;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }
    
}
