package entities;

public class ContaBancaria {

    private String numeroDaConta;
    private String nomeTitular;
    private double saldoConta;
    
    public ContaBancaria(String numeroDaConta, String nomeTitular) {
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
    }

    public ContaBancaria(String numeroDaConta, String nomeTitular, double valorDeposito) {
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
        this.saldoConta = valorDeposito;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void depositarDinheiro(double valor) {
        this.saldoConta += valor;
    }

    public void sacarDinheiro(double valor) {
        this.saldoConta -= (valor + 5.0);
    }

    public String toString() {
        return String.format(
            "Account %s, Holder: %s, Balance: %.2f",
            numeroDaConta,
            nomeTitular,
            saldoConta
        );
    }
}
