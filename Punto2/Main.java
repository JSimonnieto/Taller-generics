public class Main {
    public static void main(String[] args){
        ParLista<String,Integer> lista = new ParLista<>();
        
        lista.agregarValor("Juan", 25);
        lista.agregarValor("Simon", 5);

        System.out.println(lista.obtenerPares("Simon"));
        lista.eliminarValor("Juan");
       
    }

    
}
