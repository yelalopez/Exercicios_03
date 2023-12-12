package Calculadora;

public class Calculadora {
    public double somar (double a, double b) {
        return a + b;
    }
    public double substrair(double a, double b) {
        return a - b;
    }
    public double multiplicar(double a, double b) {
        return a * b;
    }
    public double dividir(double a, double b){
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro! Divisão por 0 não é permitida!");
            return 0;
        }

    }
}
