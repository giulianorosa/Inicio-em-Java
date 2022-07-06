public class Main {
    public static void main(String[] args) {
        System.out.println("Exercícios com calculadora: ");
        Calculadora.soma(5, 8);
        Calculadora.subtracao(8, 3);
        Calculadora.multiplicacao(3, 2);
        Calculadora.divisao(4, 2);

        // Mensagem

        System.out.println("Exercício com Mensagens");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(1);
        Mensagem.obterMensagem(30);

        // Empréstimo

        System.out.println("Exercício com Empréstimo");
        Emprestimo.calcular(1000, 2);
        Emprestimo.calcular(1000, 5);
        Emprestimo.calcular(1000, 10);
    }
}
