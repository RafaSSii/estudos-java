public class Vendedor extends Funcionario{
    double comissao = 100;
    double salarioFinal = salarioBase + comissao;

    Vendedor(String nome, double salarioBase){
        super(nome, salarioBase);
        this.comissao = comissao;
        this.salarioFinal = salarioFinal;
    }

    public void imprimirInfo(){
        super.imprimirInfo();
        System.out.println("Salário com comissao: "+ this.salarioFinal);
    }
}
