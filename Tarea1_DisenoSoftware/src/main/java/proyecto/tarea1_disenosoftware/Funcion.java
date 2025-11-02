package proyecto.tarea1_disenosoftware;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.EnumMap;
import java.util.Map;

public class Funcion {
    private final String id;
    private final Sala sala;
    private LocalDateTime fechaHora;
    private final Map<TipoAsiento, Double> tarifaPorTipo = new EnumMap<>(TipoAsiento.class);

    // === Constructor original ===
    public Funcion(String id, Sala sala, LocalDateTime fechaHora) {
        this.id = id;
        this.sala = sala;
        this.fechaHora = fechaHora;
        // tarifas por defecto
        tarifaPorTipo.put(TipoAsiento.ESTANDAR, 5.0);
        tarifaPorTipo.put(TipoAsiento.VIP, 8.0);
        tarifaPorTipo.put(TipoAsiento.CUATRO_D, 10.0);
    }

    // === NUEVO constructor compatible con TestAdministrador ===
    public Funcion(Sala sala, Date fecha) {
        this.id = "F-" + System.currentTimeMillis(); // genera id automático
        this.sala = sala;
        // convierte Date -> LocalDateTime
        this.fechaHora = LocalDateTime.ofInstant(fecha.toInstant(), ZoneId.systemDefault());

        // tarifas por defecto (mantiene coherencia)
        tarifaPorTipo.put(TipoAsiento.ESTANDAR, 5.0);
        tarifaPorTipo.put(TipoAsiento.VIP, 8.0);
        tarifaPorTipo.put(TipoAsiento.CUATRO_D, 10.0);
    }

    // === Getters ===
    public String getId() { return id; }
    public Sala getSala() { return sala; }
    public LocalDateTime getFechaHora() { return fechaHora; }

    // ==== usado en Caso 2 (self-call en tu diagrama) ====
    public void actualizarDatos(LocalDateTime nuevaFechaHora) {
        this.fechaHora = nuevaFechaHora;
    }

    // ==== usado en Caso 2 (loop por tipo de asiento) ====
    public void aplicarTarifa(TipoAsiento tipo, double valor) {
        tarifaPorTipo.put(tipo, valor);
    }

    // ==== usado en Caso 1 para calcular total ====
    public double tarifaDe(TipoAsiento tipo) {
        return tarifaPorTipo.getOrDefault(tipo, 0.0);
    }

    // === Método adicional opcional para depuración (no obligatorio) ===
    @Override
    public String toString() {
        return "Funcion{" +
                "id='" + id + '\'' +
                ", sala=" + (sala != null ? sala.getNombre() : "null") +
                ", fechaHora=" + fechaHora +
                '}';
    }
}
