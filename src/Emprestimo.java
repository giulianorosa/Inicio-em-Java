public class Emprestimo {

    public static double getTaxaMenorIgualDuasParcelas() {

        return 0.20;
    }

    public static double getTaxaMenorIgualCincoParcelas() {

        return 0.45;
    }


    public static void calcular(double valor, int parcelas) {
        if (parcelas <= 2) {
            double valorFinal = valor + (valor * getTaxaMenorIgualDuasParcelas());

            System.out.println("Valor final do empréstimo em " + parcelas + " é de R$ " + valorFinal);
        } else if (parcelas <= 5){
            double valorFinal = valor + (valor * getTaxaMenorIgualCincoParcelas());

            System.out.println("Valor final do empréstimo em " + parcelas + " é de R$ " + valorFinal);
            } else {
            System.out.println("Quantidade de parcelas acima do permitido.");
        }
    }
}
