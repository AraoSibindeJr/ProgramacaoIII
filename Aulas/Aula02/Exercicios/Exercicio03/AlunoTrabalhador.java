package Aulas.Aula02.Exercicios.Exercicio03;

public class AlunoTrabalhador extends Funcionario{
    private int horasTrabalho;
    public AlunoTrabalhador(double  salario, int horasTrabalho){
        super(salario);
        this.horasTrabalho = horasTrabalho;
    }
    public void calculaSalario(double salario, int horasTrabalho){
        if(horasTrabalho < 0 || horasTrabalho > 160){
            throw new IllegalArgumentException("Num pode!");
        }
        salario *= horasTrabalho;
        System.out.println(" Salario do Estudante e: " + salario+"$$");
    }
    /*public void getMessage(){
        System.out.println();
    }*/
}
