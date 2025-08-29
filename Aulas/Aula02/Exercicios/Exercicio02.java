package Aulas.Aula02.Exercicios;
// Criar metodos que provocam diferentes tipos de excecoes
public class Exercicio02 {
    // ClassCastException: Erro ao fazer o casting
    public static void excecao01(){
        Object obj = "Arao";
        obj = (int)obj;
        System.out.println(obj);
    }

    //IllegalArgumentException: Quando um valor esta fora do escopo esperado
    public static void excecao02(){
        int n = 10;
        if(n!=10){
            throw new IllegalArgumentException("Valor de n deve ser diferente de 10");
        }
    }

    //NullPointerException: Referenciar um objecto nulo
    public static void excecao03(){
        String numeroInvalido = null;
        int n = numeroInvalido.length();
        System.out.println(n);
    }

    //NumberFormatException: Tipo nao suportado
    public static void excecao04(){
        String numeroInvalido = "123qbc";
        int n1 =Integer.parseInt(numeroInvalido);
        System.out.println(n1);
    }

    //NegativeArraySizeException: Tentar criar um array Negativo
    public static void excecao05(){
        int [] a = new int[-2];
    }

    public static void main(String[] args) {
       // excecao01();
       // excecao02();
       // excecao03();
       // excecao04();
        excecao05();
    }

}
