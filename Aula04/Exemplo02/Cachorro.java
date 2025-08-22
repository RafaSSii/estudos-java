package Aula04.Exemplo02;

public class Cachorro extends Mamifero {
    private String raca;

    public Cachorro(String nome, int idade, String corPelo, String raca) {
        super(nome, idade, corPelo);
        this.raca = raca;
    }

    public String latir(){
        return getNome() + " está latindo: au au";
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
