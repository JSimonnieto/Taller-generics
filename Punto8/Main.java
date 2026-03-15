import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<>();

        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);
        pila.push(50);

        Par<Stack<Integer>, Stack<Integer>> resultado = Utilidades.splitStack(pila, 2);

        System.out.println("Pila 1: " + resultado.primero);
        System.out.println("Pila 2: " + resultado.segundo);
    }
}