package Aulas.Aula02.Exercicios.Exercicio03;

public class Executavel {
    public static void main(String[] args) {
        Professor prof01 = new Professor(200);
        AlunoTrabalhador aluno01 = new AlunoTrabalhador(200,-2);
        aluno01.calculaSalario(200,2);
//        prof01.setSalario(20);
    }
}
