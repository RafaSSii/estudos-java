package Aula04.Exemplo01;

public class ClienteFisico extends Cliente {
    public String nome;
    public String cpf;

    public ClienteFisico(String codigo, String endereco, String nome, String cpf) {
        super(codigo, endereco);
        this.nome = nome;
        this.cpf = cpf;
    }

    public ClienteFisico(String codigo, String endereco) {
        super(codigo, endereco);
    }

    public String verificarCpf(){
        return cpf;
    }
}
