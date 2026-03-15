import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(5);
        numeros.add(30);
        numeros.add(20);

        Integer max = Utilidades.maximo(numeros);

        System.out.println("Lista: " + numeros);
        System.out.println("El máximo es: " + max);
    }
}