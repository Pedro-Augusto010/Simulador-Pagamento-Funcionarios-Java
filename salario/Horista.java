public class Horista extends Funcionario {

    private int horasTrabalhadas;
    private double valorHora;

    public Horista(String nome, int matricula, int horasTrabalhadas, double valorHora) {
        super(nome, matricula);

        if (horasTrabalhadas < 0) {
            throw new IllegalArgumentException("Horas nao podem ser negativas.");
        }

        if (valorHora < 0) {
            throw new IllegalArgumentException("Valor da hora nao pode ser negativo.");
        }

        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        if (horasTrabalhadas < 0) {
            throw new IllegalArgumentException("Horas nao podem ser negativas.");
        }

        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if (valorHora < 0) {
            throw new IllegalArgumentException("Valor da hora nao pode ser negativo.");
        }

        this.valorHora = valorHora;
    }

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * valorHora;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();

        System.out.println("Horas trabalhadas: " + horasTrabalhadas);
        System.out.println("Valor da hora: R$ " + valorHora);
        System.out.println("Pagamento: R$ " + calcularPagamento());
    }
}