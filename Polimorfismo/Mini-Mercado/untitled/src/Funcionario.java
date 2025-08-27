public class Funcionario {
    String nome;
    double salarioBase = 1512;

    Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void imprimirInfo(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Salário: "+ this.salarioBase);
    }
}
