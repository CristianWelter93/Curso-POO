public class TestaGeteSet {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.deposita(100);
        System.out.println("Saldo: "+ conta.getSaldo());

        Cliente paulo = new Cliente();
        paulo.setNome("Paulo");
        paulo.setCpf("123.456.123-42");
        paulo.setProfissao("programador");

        conta.setAgencia(386);
        System.out.println("Agencia: "+ conta.getAgencia());

        conta.setNumero(1337);
        System.out.println("Número: "+ conta.getNumero());

        conta.setTitular(paulo);
        System.out.println("Titular da conta numero "+conta.getNumero()+" : "+conta.getTitular().getNome());
    }
}
