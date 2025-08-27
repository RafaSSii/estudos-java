public class Gerente extends Funcionario{
    double bonus = 400;
    double salarioFinal = salarioBase + bonus;

    Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
        this.bonus = bonus;
        this.salarioFinal = salarioFinal;
    }


    public void imprimirInfo(){
        super.imprimirInfo();
        System.out.println("Salário com bonus: "+ this.salarioFinal);
    }
}
