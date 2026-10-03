public class Assalariado extends Funcionario {

    private double salarioMensal;

    public Assalariado(String nome, int matricula, double salarioMensal) {
        super(nome, matricula);

        if (salarioMensal < 0) {
            throw new IllegalArgumentException("Salario nao pode ser negativo.");
        }

        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal < 0) {
            throw new IllegalArgumentException("Salario nao pode ser negativo.");
        }

        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularPagamento() {
        return salarioMensal;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();

        System.out.println("Salario mensal: R$ " + salarioMensal);
        System.out.println("Pagamento: R$ " + calcularPagamento());
    }
}