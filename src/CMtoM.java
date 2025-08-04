import java.util.Scanner;

public class CMtoM {
    public static void main (String[] args){
        Scanner sca = new Scanner (System.in);
        System.out.println("Quantos cm voce deseja convertar para m? ");
        double cm = sca.nextDouble();
        sca.close();

        double converter = cm / 100;

        System.out.printf("Depois da conversão: %.2f", converter);

    }

}
