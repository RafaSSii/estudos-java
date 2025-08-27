public class Funcionario extends Pessoa {

    @Override
    public void falar(){
        System.out.println("Oi, eu sou um funcionário");
    }

    public void escutar(){
        System.out.println("Trabalhe cabra safado");
    }
}
