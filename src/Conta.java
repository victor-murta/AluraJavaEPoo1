//double saldo == atributo

public class Conta {
    double saldo ;
    int agencia  = 1;
    int numero;
    String titular;


    public void deposita(double valor){
        this.saldo += valor;
        System.out.println("Depositando: " + this.saldo);
    }

    public boolean sacar(double valor){
        if ( this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Sacando: " + this.saldo);
            return true;
        }else{
            System.out.println("Salndo insuficiente!");
            return false;
        }
    }

    public boolean transferir( double valor, Conta destino){
        if ( this.saldo < valor){
            return false;
        }else{
            this.saldo -= valor;
            destino.saldo += valor;
            return true;
        }
    }


}
