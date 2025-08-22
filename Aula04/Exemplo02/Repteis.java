package Aula04.Exemplo02;

public class Repteis extends Animal {
    private String corEscama;

    public Repteis(String nome, int idade, String corEscama) {
        super(nome, idade);
        this.corEscama = corEscama;
    }

    public String rastejar(){
        return getNome() + " está rastejando!";
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
