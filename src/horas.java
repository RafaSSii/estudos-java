import java.util.Scanner;

public class horas {
    public static void main (String[] args){
        Scanner sca = new Scanner (System.in);

        System.out.println("Quanto você ganha por hora? ");
        double ganhaPorHora = sca.nextDouble();

        System.out.println("Quantas horas você trabalha por mês? ");
        double horasTrabalhadas = sca.nextInt();


        double rendaMes = ganhaPorHora * horasTrabalhadas;

        System.out.printf("Você ganha: %.2f", rendaMes);
    }
}

//3- Desenvolva um algoritmo que pergunte quanto você ganha por hora e o número
//de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido
//mês.