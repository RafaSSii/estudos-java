package Aula04.Exemplo01;

public class ClienteJuridico extends Cliente {
    public String cnpj;
    public String razaoSocial;

    public ClienteJuridico(String codigo, String endereco, String cnpj, String razaoSocial) {
        super(codigo, endereco);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String verificarCnpj(){
        return cnpj;
    }
}
