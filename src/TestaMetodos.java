public class TestaMetodos {
    public static void main(String[] args) {
        double valor1,valor2, valor3, saque, transferencia;
        valor1 = 100;
        valor2 = 500;
        valor3 = 800;
        saque = 80;
        transferencia = 500;

        Conta c1 = new Conta();
        c1.deposita(valor1);
        System.out.println("Saldo conta 1: "+ c1.getSaldo());

        Conta c2 = new Conta();
        c2.deposita(valor2);
        System.out.println("Saldo conta 2: "+ c2.getSaldo());

        Conta c3 = new Conta();
        c3.deposita(valor3);
        System.out.println("Saldo conta 3: "+ c3.getSaldo());

        c2.saca(saque);
        System.out.println("Saldo conta 2 após saque de 80: "+ c2.getSaldo());

        if(c3.transfere(transferencia, c1)) {
            System.out.println("Saldo conta 1 após receber " + transferencia +" da conta 3: " + c1.getSaldo());
            System.out.println("Saldo conta 3 após transferir " + transferencia + " para conta 1: " + c3.getSaldo());
        }else
        {
            System.out.println("Não foi possível fazer a transferência");
        }

    }
}
