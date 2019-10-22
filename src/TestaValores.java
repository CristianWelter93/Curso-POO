public class TestaValores {
    public static void main(String[] args) {

        Conta conta = new Conta(1337, 24226);
        Conta conta2 = new Conta(1137, 24356);
        Conta conta3 = new Conta(1332, 78226);

        System.out.println("Total de Contas: "+ Conta.getTotal());
    }
}
