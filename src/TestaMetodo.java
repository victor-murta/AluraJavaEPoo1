public class TestaMetodo {

    public static void main(String[] args){
        Conta contaDoVictor = new Conta();
        contaDoVictor.titular = "Victor Murta";
        contaDoVictor.saldo = 10.00;
        contaDoVictor.deposita(50);
        contaDoVictor.sacar(10);

        Conta contaDoJassa =new Conta();
        contaDoJassa.deposita(1000);

        if(contaDoJassa.transferir(3000, contaDoVictor)){
            System.out.println("Saldo enviado com sucesso ");
        }else{
            System.out.println("Operação cancelada ,saldo unsificiente ");
        }



    }
}
