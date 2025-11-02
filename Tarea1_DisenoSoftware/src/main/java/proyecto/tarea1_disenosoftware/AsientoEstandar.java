package proyecto.tarea1_disenosoftware;

public class AsientoEstandar extends Asiento {

    public AsientoEstandar(String id) {
        super(id, TipoAsiento.ESTANDAR);
    }

    @Override
    public double getPrecio() {
        return 10.0;
    }

    @Override
    public String getDescripcion() {
        return "Asiento Estándar";
    }
}
