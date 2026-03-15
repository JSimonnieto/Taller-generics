import java.util.Stack;

public class spliceStack{

    public static Stack<Integer> spliceStack(Stack<Integer> s, int i, int j){
        
        Stack<Integer> temp = new Stack<>();
        Stack<Integer> resultado = new Stack<>();

        int size = s.size();

        for(int pos = 0; pos < size; pos++){
            int valor = s.pop();

            if(pos >= i && pos < j){
                resultado.push(valor);
            } else {
                temp.push(valor);
            }
        }

        while(!temp.isEmpty()){
            s.push(temp.pop());
        }
        return resultado;
    }
}