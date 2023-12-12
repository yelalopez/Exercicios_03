package Exercicio_04;

public class Funcionario {
    private String name;
    private int workedHours;
    private double moneyPerHour;

    public Funcionario(String name, int workedHours, double moneyPerHour) {
        this.name = name;
        this.workedHours = workedHours;
        this.moneyPerHour = moneyPerHour;
    }

    public double calcSalary(){
        double anualSalary = (workedHours * moneyPerHour) * 12;
        return anualSalary;
    }

}
