import java.util.Stack;

public class Utilidades {

    public static Par<Stack<Integer>, Stack<Integer>> splitStack(Stack<Integer> s, int i){

        Stack<Integer> temp = new Stack<>();
        Stack<Integer> pila1 = new Stack<>();
        Stack<Integer> pila2 = new Stack<>();

        int size = s.size();

        while(!s.isEmpty()){
            temp.push(s.pop());
        }

        for(int pos = 0; pos < size; pos++){
            int valor = temp.pop();

            if(pos < i){
                pila1.push(valor);
            }else{
                pila2.push(valor);
            }

            // restaurar la pila original
            s.push(valor);
        }
        return new Par<>(pila1, pila2);
    }
}