public class Calculadora {

    public static void soma(int num1, int num2) {
        int resultado = num1 + num2;

        System.out.println("A Soma de " + num1 + " mais " + num2 + " é igual a " + resultado);
    }

    public static void subtracao(int num1, int num2) {
        int resultado = num1 - num2;

        System.out.println("A Subtração de " + num1 + " menos " + num2 + " é igual a " + resultado);
    }

    public static void multiplicacao(int num1, int num2) {
        int resultado = num1 * num2;

        System.out.println("A multiplicação de " + num1 + " com " + num2 + " é " + resultado);
    }

    public static void divisao(int num1, int num2) {
        int resultado = num1 / num2;

        System.out.println("A Divisão entre " + num1 + " e " + num2 + " é " + resultado);
    }
}
