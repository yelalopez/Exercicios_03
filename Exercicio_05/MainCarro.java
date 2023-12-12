package Exercicio_05;

import java.util.Scanner;

public class MainCarro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tempo gasto na viagem em Horas: ");
        double viagemHoras = input.nextDouble();

        System.out.println("Digite velocidade média durante (em km/h) ");
        double velocidadeMedia = input.nextDouble();

        CalcConsumo carroJoao = new CalcConsumo(viagemHoras, velocidadeMedia);

        carroJoao.calcGasto();
    }
}
