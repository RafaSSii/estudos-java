public class Main {
    public static void main(String[] args) {
        System.out.println("Informações do Paciente");
        Pessoa paciente = new Paciente("1234", "Unimed", "Rafael", 22, "1234567");
        paciente.imprimirInfo();

        System.out.println("\nInformações do Enfermeiro");
        Pessoa enfermeiro = new Enfermeiro(12, "Coleta", "789", "Luiza", 21, "4567");
        enfermeiro.imprimirInfo();
    }
}