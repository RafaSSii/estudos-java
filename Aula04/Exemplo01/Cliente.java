package Aula04.Exemplo01;

public class Cliente {
    public String codigo;
    public String endereco;

    public Cliente(String nome, String endereco) {
        this.codigo = nome;
        this.endereco = endereco;
    }
    public String localizarEndereco(){
        if (endereco != null){
            return endereco;
        }
        return null;
    }
}
