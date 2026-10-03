public class Main {

    public static void main(String[] args) {

        Assalariado ana = new Assalariado("Ana", 101, 4500.00);

        Horista bruno = new Horista("Bruno", 102, 172, 35.50);

        Comissionado carla = new Comissionado("Carla", 103, 48000.00, 6.5);

        System.out.println("===== ASSALARIADO =====");
        ana.exibirDados();

        System.out.println();

        System.out.println("===== HORISTA =====");
        bruno.exibirDados();

        System.out.println();

        System.out.println("===== COMISSIONADO =====");
        carla.exibirDados();

        System.out.println();

        System.out.println("===== RESUMO =====");

        System.out.printf("Ana - R$ %.2f%n", ana.calcularPagamento());
        System.out.printf("Bruno - R$ %.2f%n", bruno.calcularPagamento());
        System.out.printf("Carla - R$ %.2f%n", carla.calcularPagamento());
    }
}