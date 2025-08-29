package Avaliacoes.MiniTestes.MiniTeste01;

public class Exercicio04 {
    /*
    * Descreva duas excecoes em Java e de exemplo das duas
    * */
    public static void main(String[] args) {
        excecao01();
        excecao02();

    }
    public static void excecao01(){
        try{
            int [] a = new int[5];
            a[5]=2;
            System.out.println(a[5]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("O Array estourou " + e.getMessage());
        }
    }

    public static void excecao02(){
        try{
            int [] a = new int[-5];
            a[3]=2;
            System.out.println(a[3]);
        }catch (NegativeArraySizeException e){
            System.out.println("O Array tem indice negativo " + e.getMessage());
        }
    }
}
