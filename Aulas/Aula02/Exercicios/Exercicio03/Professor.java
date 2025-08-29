package Aulas.Aula02.Exercicios.Exercicio03;

public class Professor extends Funcionario{
    public Professor(double salario){
        super(salario);
    }
    public void setSalario(double salario){
        this.salario = salario;
        System.out.println("Salario do Professor e: " + salario+"$$");
    }
}
