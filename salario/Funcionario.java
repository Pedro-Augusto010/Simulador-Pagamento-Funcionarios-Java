public class Funcionario {

    private String nome;
    private int matricula;

    public Funcionario(String nome, int matricula) {
        if (matricula < 0) {
            throw new IllegalArgumentException("Matricula nao pode ser negativa.");
        }

        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if (matricula < 0) {
            throw new IllegalArgumentException("Matricula nao pode ser negativa.");
        }

        this.matricula = matricula;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
    }

    public double calcularPagamento() {
        return 0;
    }
}