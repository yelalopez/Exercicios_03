package Exercicio_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Indique a temperatura atual");
        double temp = input.nextDouble();
        input.nextLine();

        System.out.println("Indique a medida atual: Celsius, fahrenheit, Kelvin");
        String medidaAtual = input.nextLine();

        System.out.println("Indique a medida final: Celsius, fahrenheit, Kelvin");
        String medidaFinal = input.nextLine();

        Convert temperaura1 = new Convert();
        double newTemp = temperaura1.convertTemperature(temp, medidaAtual, medidaFinal);

        System.out.println("Temperatura atual: " + temp);
        System.out.println("Medida atual: " + medidaAtual);
        System.out.println("Medida Final: " + medidaFinal);
        System.out.printf("Output: %2.2f", newTemp);

    }
}
