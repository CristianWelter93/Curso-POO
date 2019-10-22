public class TestaGeteSet {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.deposita(100);
        System.out.println("Saldo: "+ conta.getSaldo());

        conta.setTitular(new Cliente());

        conta.setAgencia(386);
        System.out.println("Agencia: "+ conta.getAgencia());

        conta.setNumero(1337);
        System.out.println("Número: "+ conta.getNumero());
    }
}
