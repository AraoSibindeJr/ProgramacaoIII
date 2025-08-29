package Avaliacoes.MiniTestes.MiniTeste01;
import java.util.Scanner;
/*
* Criar um jogo de adivinha onde o usuario deve adivinhar um numero no intervalo de [0-10]
* se o usuario inserir um valor fora desse intervalo deve retornar uma excecao personalizada*/
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" JOGO DE ADIVINHA ");
        System.out.println(" Insira um numero no intervalo de [0 - 10] ");
        int n =sc.nextInt();
        int numeroCerto = 3;
        if(0 > n || n >10){
            throw new MinhaExcecao("VALOR INVALIDO! ");
        }else{
            System.out.println("Procurando numero... ");
            if(n == numeroCerto){
                System.out.println(" PARABENS, ACERTOU!");
            }else{
                System.out.println("ERROU, tente novamente.");
            }
        }
    }
}
