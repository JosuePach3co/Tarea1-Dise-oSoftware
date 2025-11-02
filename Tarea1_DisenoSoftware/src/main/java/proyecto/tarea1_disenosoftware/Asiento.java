package proyecto.tarea1_disenosoftware;

public class Asiento {
    private final String id;
    private final TipoAsiento tipo;
    private EstadoAsiento estado = EstadoAsiento.DISPONIBLE;

    public Asiento(String id, TipoAsiento tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public String getId() { return id; }
    public TipoAsiento getTipo() { return tipo; }
    public EstadoAsiento getEstado() { return estado; }

    // ==== usado por tu diagrama ====
    public void marcarEnProceso() { this.estado = EstadoAsiento.EN_PROCESO; }
    public void marcarReservado() { this.estado = EstadoAsiento.RESERVADO; }
    public void marcarDisponible() { this.estado = EstadoAsiento.DISPONIBLE; }

    @Override public String toString() {
        return id + "(" + tipo + "," + estado + ")";
    }
}
