//- Um pescador comprou um microcomputador para controlar o rendimento diário
//de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido
//pelo regulamento de pesca do estado de São Paulo (50 quilos), deve pagar uma
//multa de R$ 4,00 por quilo excedente. O pescador precisa que você faça um
//algoritmo que leia a variável (peso de peixes) e calcule o excesso, com isso emita o
//valor da multa que ele deve pagar, sempre que exceder o peso
import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double limitePeso = 50;
        double multaKg = 4;


        System.out.println("Quantos quilos de peixe você pegou? ");
        double kg = scanner.nextDouble();

        double excesso = 0;
        double multa = 0;

        if (kg > limitePeso){
            excesso = kg - limitePeso;
            multa = excesso * multaKg;
        }

        System.out.println("Excesso: " + excesso + " kg");
        System.out.println("Multa a pagar: R$ " + multa);

        scanner.close();
    }
}
