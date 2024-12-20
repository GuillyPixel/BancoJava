import java.util.*;


public class Conta {

    int numero_conta;
    String titular_conta;
    double saldo;

    Scanner entrada = new Scanner(System.in);
    public Conta (String nome_titular, double saldo_inicial){
        this.titular_conta = nome_titular;
        this.saldo = saldo_inicial;

        Random gerador_numero = new Random();
        numero_conta = gerador_numero.nextInt();
    }
    public void VerSaldo(){
        System.out.println("Número da conta:" + numero_conta);
        System.out.println("O nome do titular:" + titular_conta);
        System.out.println("Saldo da conta:" + saldo) ;
    }
    public void Saque(double valor_saque){
        if(saldo>= valor_saque)
            saldo = saldo - valor_saque;
        System.out.println("Seu saldo atual é:" + saldo);
    }

    public void Deposito( double valor_deposito){
        if (valor_deposito <=0){
            System.out.println("Depósito Inválido");
        }
        else{
            saldo = saldo + valor_deposito;
            System.out.println("Depósito Realizado");
            System.out.println("Saldo novo:" + saldo);
        }
    }

    public void Iniciar (){
        int opcao;
        do{
            Exibir_menu();
            opcao = entrada.nextInt();
            Escolher_funcao(opcao);
        } while (opcao !=4);
    }

    public void  Exibir_menu(){
        System.out.println("Bem vindo ao bank!");
        System.out.println("Escolha sua opção");
        System.out.println("1 - Ver saldo");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Finalizar");
    }

    public void Escolher_funcao(int opcao){
        double saque;
        double deposito;

        switch (opcao){
            case 1:
                VerSaldo();
                break;

            case 2:
                System.out.println("Digite o valor para o saque:");
                saque = entrada.nextDouble();
                Saque(saque);
                break;

            case 3:
                System.out.println("Digite o valor para o depósito:");
                deposito = entrada.nextDouble();
                Deposito(deposito);
                break;

            case 4:
                System.out.println("Operação Finalizada");
                break;

            default:
                System.out.println("Opção inválida");

        }
    }

}
