public class Main {
    public static void main(String[] args) {
        System.out.println("Dados do Funcionário");
        Funcionario funcionario = new Funcionario("José", 1512);

        funcionario.imprimirInfo();

        System.out.println("\nDados do Gerente");
        Gerente gerente = new Gerente("Rafael", 1512);

        gerente.imprimirInfo();

        System.out.println("\nDados do vendedor");
        Vendedor vendedor = new Vendedor("Tomas", 1512);

        vendedor.imprimirInfo();

    }
}