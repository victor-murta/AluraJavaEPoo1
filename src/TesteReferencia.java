
public class TesteReferencia {
    //conta1 não é um objeto, é uma referência da classe Conta
    public static void main(String[] args){
        Conta contaUm = new Conta();
        contaUm.saldo = 20.00;
        System.out.println("Conta 1: " + contaUm.saldo);
        Conta contaDois = contaUm;
        contaDois.saldo = 30.00;
        System.out.println("Conta 2: " + contaDois.saldo);

    }


}
