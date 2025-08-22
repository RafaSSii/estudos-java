package Aula04.Exemplo01;

public class MainCliente {
    public static void main(String[] args) {
        ClienteFisico fisico = new ClienteFisico("01", "BTN 02 - Paulo Afonso BA", "Black Ju", "0234");
        ClienteJuridico juridico = new ClienteJuridico("02", "Rua Unica - Agua Branca AL", "024567", "Thuco Acompanhnantes");

        Cliente cliente = new Cliente("03", "BTN 03 - Paulo Afonso BA");

        System.out.println(fisico.verificarCpf());
        System.out.println(fisico.localizarEndereco());

        System.out.println(juridico.verificarCnpj());
        System.out.println(juridico.localizarEndereco());

        System.out.println(cliente.localizarEndereco());
    }
}
