package Exercicio_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        int num = input.nextInt();

        Fatorial fatorialFunction = new Fatorial();

        int newFatorial = fatorialFunction.fatorial(num);

        System.out.println(num +"! = " + newFatorial);

    }

}
