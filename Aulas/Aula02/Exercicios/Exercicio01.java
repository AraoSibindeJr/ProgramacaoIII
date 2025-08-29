package Aulas.Aula02.Exercicios;
import java.util.Scanner;
/* Faça um programa Java que solicite dois números ao utilizador e, em seguida, imprime o resultado
da divisão do primeiro pelo segundo. Trate a exceção ArithmeticException. Teste o método
getMessage e printStackTrace de Exception e observe o tipo de mensagem que retorna.  */
public class Exercicio01 {
    public static void divisao(int n1, int n2){
        int resultado =0;
        try{
             resultado = n1/n2;

        }catch(ArithmeticException e){
            System.out.println("Excecao capturada: " + e.getMessage());
            System.out.println("Excecao capturada: " + e.fillInStackTrace());// Da informacao mais especifica sobre a excecao

        }finally {
            System.out.println("Resulado: " + resultado);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Insira um numero: ");
        int n1 = sc.nextInt();
        System.out.println(" Insira outro numero: ");
        int n2 = sc.nextInt();
        divisao(n1,n2);
    }
}
