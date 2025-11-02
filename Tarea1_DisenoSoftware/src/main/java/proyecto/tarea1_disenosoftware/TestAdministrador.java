package proyecto.tarea1_disenosoftware;

import java.util.Calendar;

public class TestAdministrador {
    public static void main(String[] args) {
        Sala sala = new Sala(1);
        Calendar cal = Calendar.getInstance();

        cal.add(Calendar.HOUR, 2);

        Funcion funcion = new Funcion(sala, cal.getTime());

        Sistema sistema = new Sistema();

        Calendar nueva = Calendar.getInstance();
        nueva.add(Calendar.HOUR, 3);

        boolean resultado = sistema.modificarFuncionYNotificar(funcion, nueva.getTime());
        
        System.out.println("Resultado operación: " + resultado);
    }
}
