package Aula04.Exemplo02;

public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //metodos comuns  a classe e as subclasses
    public String comer(){
        return this.nome + " está se alimentando";
    }

    public String dormir(){
        return this.nome + " está se dormindo";
    }

    public String exibirDetalhes(){
        return "Nome: " +this.nome+" - Idade: "+this.idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
