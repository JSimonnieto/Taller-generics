import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<>();

        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);
        pila.push(50);

        System.out.println("Pila original: " + pila);

        Stack<Integer> resultado = spliceStack.spliceStack(pila, 1, 3);

        System.out.println("Pila resultado (elementos entre i y j): " + resultado);
        System.out.println("Pila restante: " + pila);
    }
}