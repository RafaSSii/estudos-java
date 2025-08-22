package Aula04.Exemplo02;

public class Jacare extends Repteis{
    private String raca;

    public Jacare(String nome, int idade, String corEscama, String raca) {
        super(nome, idade, corEscama);
        this.raca = raca;
    }

    public String nadar(){
        return getNome() + " está nadando!";
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
