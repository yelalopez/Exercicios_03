package Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double num1 = 25;
        double num2 = 2;

        System.out.println("Soma: " + calc.somar(num1, num2));
        System.out.println("Substrair: " + calc.substrair(num1, num2));
        System.out.println("Multiplicar: " + calc.multiplicar(num1, num2));
        System.out.println("Dividir: " + calc.dividir(num1, num2));

    }
}
