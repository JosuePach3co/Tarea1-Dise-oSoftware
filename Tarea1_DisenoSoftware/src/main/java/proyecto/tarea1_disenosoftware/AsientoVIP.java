package proyecto.tarea1_disenosoftware;

public class AsientoVIP extends Asiento {

    public AsientoVIP(String id) {
        super(id, TipoAsiento.VIP);
    }

    @Override
    public double getPrecio() {
        return 15.0;
    }

    @Override
    public String getDescripcion() {
        return "Asiento VIP";
    }
}
