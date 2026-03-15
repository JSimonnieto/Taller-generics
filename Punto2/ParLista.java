import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ParLista<K, V> {

    List<Par<K, V>> lista = new ArrayList<>();

    public void agregarValor(K clave, V valor) {
        lista.add(new Par<>(clave, valor));
    }

    public void eliminarValor(K clave) {
        for (int i = 0; i < lista.size(); i++) {
            if (Objects.equals(lista.get(i).getClave(), clave)) {
                lista.remove(i);
                i--;
            }
        }
    }

    public V obtenerPares(K clave) {
        for (Par<K, V> par : lista) {
            if (Objects.equals(par.getClave(), clave)) {
                return par.getValor();
            }
        }
        return null;
    }

    public void mostrarTodos() {
        for (Par<K, V> par : lista) {
            System.out.println("Clave: " + par.getClave() + " | Valor: " + par.getValor());
        }
    }
}