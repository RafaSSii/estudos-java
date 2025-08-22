package Aula04.Exemplo02;

public class Main {
    public static void main(String[] args) {
       Cachorro cachorro = new Cachorro("Sholinha", 2, "marrom", "Caramelo");
       System.out.println(cachorro.exibirDetalhes());
        System.out.println(cachorro.comer());
        System.out.println(cachorro.dormir());
        System.out.println(cachorro.amamentar());
        System.out.println(cachorro.latir());

        Jacare jacare = new Jacare("Zé Jacaré", 40,"verde","Papo amarelo");
        System.out.println(jacare.exibirDetalhes());
        System.out.println(jacare.comer());
        System.out.println(jacare.dormir());
        System.out.println(jacare.rastejar());
        System.out.println(jacare.nadar());



    }
}
