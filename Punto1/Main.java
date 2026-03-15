import java.util.Date;

public class Main {

    public static void main(String[] args) {

        ListaDeTareas<Tarea> lista = new ListaDeTareas<>();

        lista.agregarTarea(new Tarea("Tarea", 5, new Date(2026-1900, 2, 20)));
        lista.agregarTarea(new Tarea("Proyecto Final", 2, new Date(2026-1900, 2, 10)));
   
        System.out.println("Tareas por prioridad 5: " );
        lista.obtenerTareasPrioridad(5);
        System.out.println("\n Tareas ordenadas por fecha: " );
        lista.mostrarOrdenadasPorFecha();
    }
}
