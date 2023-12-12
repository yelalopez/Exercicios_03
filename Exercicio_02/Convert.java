package Exercicio_02;

public class Convert {
    public double convertTemperature(double tempAtual, String medidaAtual, String medidaFinal){
        if(medidaAtual.equalsIgnoreCase("celsius") && medidaFinal.equalsIgnoreCase("fahrenheit")){
            return (tempAtual * 1.8) + 32;
        } else if (medidaAtual.equalsIgnoreCase("celsius") && medidaFinal.equalsIgnoreCase("kelvin")) {
            return tempAtual + 273.15;
        } else if (medidaAtual.equalsIgnoreCase("fahrenheit") && medidaFinal.equalsIgnoreCase("celsius")) {
            return (tempAtual - 32) / 1.8;
        } else if (medidaAtual.equalsIgnoreCase("fahrenheit") && medidaFinal.equalsIgnoreCase("kelvin")) {
            return (tempAtual - 32) / 1.8 + 273.15;
        } else if(medidaAtual.equalsIgnoreCase("kelvin") && medidaFinal.equalsIgnoreCase("celsius")){
            return tempAtual - 273.15;
        } else if (medidaAtual.equalsIgnoreCase("kelvin") && medidaFinal.equalsIgnoreCase("fahrenheit")) {
            return (tempAtual - 273.15) * 1.8 + 32;
        }else{
            System.out.println("Medida atual e medida final não são compatíveis para conversão.");
            return 0;
        }
    }
}
