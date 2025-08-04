import java.util.Scanner;

public class p_ou_i {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite por qual número quer começar");
        int num1 = scanner.nextInt();

        System.out.println("Digite por qual número quer terminar");
        int num2 = scanner.nextInt();
        
        for (int i = num1; i <= num2; i++){
            if (i % 2 == 0){
                System.out.println(i);
            } else {
                System.out.println(" ");
            }
        }
    }
}