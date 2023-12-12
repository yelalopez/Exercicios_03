package Exercicio_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nomeFuncionario = input.nextLine();

        System.out.println("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = input.nextInt();

        System.out.println("Digite o valor da hora trabalhada: ");
        double valorHora = input.nextDouble();

        input.close();

        Funcionario funcionario1 = new Funcionario(nomeFuncionario, horasTrabalhadas, valorHora);

        double salarioFuncionario1 = funcionario1.calcSalary();

        System.out.printf("O salário anual do funcionário %s é de %.2f", nomeFuncionario, salarioFuncionario1);

    }
}
