public class TesteClienteConta {
    public static void main(String[] args) {
        Conta contadoJoao= new Conta();
        Cliente joao = new Cliente();
        joao.setNome("João");

        contadoJoao.setTitular(joao);

        contadoJoao.deposita(500);
        System.out.printf("Conta com o saldo de " + contadoJoao.getSaldo()+ " pertence ao " + contadoJoao.getTitular().getNome());
    }
}
