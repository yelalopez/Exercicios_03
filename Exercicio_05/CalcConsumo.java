package Exercicio_05;

public class CalcConsumo {
    double kmPorLitro;
    double tempoEmHoras;
    double velocidadeMedia;
    int consumoKmPorLitro;

    public CalcConsumo(double tempoEmHoras, double valocidadeMedia) {
        this.kmPorLitro = kmPorLitro;
        this.tempoEmHoras = tempoEmHoras;
        this.velocidadeMedia = valocidadeMedia;
        this.consumoKmPorLitro = 12;
    }

    public void calcGasto(){
        double distanciaPercorrida = tempoEmHoras * velocidadeMedia;
        double combustivelGasto = distanciaPercorrida / consumoKmPorLitro;
        System.out.printf("A quantidade de combustível gasta foi de %.3f litros.", combustivelGasto);
    }
}
