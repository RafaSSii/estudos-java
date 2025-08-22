package Aula04.Exemplo02;

public class Mamifero extends Animal {
    private String corPelo;

    public Mamifero(String nome, int idade, String corPelo) {
        super(nome, idade);
        this.corPelo = corPelo;
    }

    //Método específico da subclasse
    public String amamentar(){
        return getNome() + " está amamentando!";
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
