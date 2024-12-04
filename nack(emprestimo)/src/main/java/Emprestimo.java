import java.util.*;

public class Emprestimo {

    String titular;
    double valorEmprestimo;
    double taxaJuros;

    public Emprestimo(String titular, double valorEmprestimo, double taxaJuros) {
        this.titular = titular;
        this.valorEmprestimo = valorEmprestimo;
        this.taxaJuros = taxaJuros;
    }

    public void exibirDetalhes() {
        System.out.println("Ttitular" + titular);
        System.out.println("Valor do empréstimo:" + valorEmprestimo);
        System.out.println("Taxa de juros: " + taxaJuros);
    }

    public double calcularMontante() {
        return valorEmprestimo + (valorEmprestimo * (taxaJuros / 100));
      }

    public void Iniciar() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Nome do titular:");
        String titular = entrada.nextLine();

        System.out.println("valor do empréstimo:");
        double valorEmprestimo = entrada.nextDouble();
        System.out.println("A taxa de juros é:");
        double taxaJuros = entrada.nextDouble();

        Emprestimo emprestimo = new Emprestimo(titular, valorEmprestimo, taxaJuros);

        emprestimo.exibirDetalhes();
        System.out.println("O valor total para o pagamento:" + emprestimo.calcularMontante());

        entrada.close();
    }
}
