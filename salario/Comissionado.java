public class Comissionado extends Funcionario {

    private double totalVendas;
    private double percentualComissao;

    public Comissionado(String nome, int matricula, double totalVendas, double percentualComissao) {
        super(nome, matricula);

        if (totalVendas < 0) {
            throw new IllegalArgumentException("Total de vendas nao pode ser negativo.");
        }

        if (percentualComissao < 0 || percentualComissao > 100) {
            throw new IllegalArgumentException("Comissao deve estar entre 0 e 100.");
        }

        this.totalVendas = totalVendas;
        this.percentualComissao = percentualComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        if (totalVendas < 0) {
            throw new IllegalArgumentException("Total de vendas nao pode ser negativo.");
        }

        this.totalVendas = totalVendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        if (percentualComissao < 0 || percentualComissao > 100) {
            throw new IllegalArgumentException("Comissao deve estar entre 0 e 100.");
        }

        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularPagamento() {
        return totalVendas * percentualComissao / 100;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();

        System.out.println("Total de vendas: R$ " + totalVendas);
        System.out.println("Percentual de comissao: " + percentualComissao + "%");
        System.out.println("Pagamento: R$ " + calcularPagamento());
    }
}