public class Main {

    public static void main(String[] args){

        Comparador<Integer> compNum = new ComparadorNumeros();

        System.out.println(compNum.comparar(10,5));
        System.out.println(compNum.comparar(3,8));

        Comparador<String> compStr = new ComparadorCadenas();

        System.out.println(compStr.comparar("Ana","Luis"));
        System.out.println(compStr.comparar("Pedro","Pedro"));
    }
}