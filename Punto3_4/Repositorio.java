import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Repositorio<T> implements Iterable<T>{

    List<T> lista = new ArrayList<>();

    public void agregar(T elemento){
        lista.add(elemento);
    }

    public T obtener(int indice){
        return lista.get(indice);
    }
    
    @Override
    public Iterator<T> iterator(){
        return lista.iterator();
    }

    public Iterator<T> iteratorPeronalizado(){
        return new Iterator<T>(){
            int indice = lista.size() -1;

            @Override
            public boolean hasNext(){
                return indice >= 0;
            }

            @Override
            public T next(){
                return lista.get(indice--);
            }
        };
    }
}