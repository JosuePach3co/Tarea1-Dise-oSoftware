package proyecto.tarea1_disenosoftware;

public class Asiento4D extends Asiento {

    public Asiento4D(String id) {
        super(id, TipoAsiento.CUATRO_D); // <- llamas al constructor correcto de Asiento
    }

    @Override
    public double getPrecio() {
        return 18.0;
    }

    @Override
    public String getDescripcion() {
        return "Asiento 4D";
    }
}
