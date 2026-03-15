import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListaDeTareas<T extends Tarea> {
    
    List<T> lista = new ArrayList<>();

    public void agregarTarea(T t){
        lista.add(t);
    }

    public void obtenerTareasPrioridad(int prioridad){

        for(T Tarea : lista){
            if (Tarea.getPrioridad() == prioridad ){
                System.out.println("Prioridad: " + Tarea.getPrioridad() + " Descripcion: " + Tarea.getDescripcion());
            }
        }
    }

    public void mostrarOrdenadasPorFecha() {

        lista.sort(Comparator.comparing(Tarea::getFechaVencimiento));

        for(T Tarea : lista){
            System.out.println("Ordenado: \n "  + Tarea.getFechaVencimiento() + Tarea.getDescripcion() );
        }
    }
}
