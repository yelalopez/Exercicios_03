package Exercicio_03;

public class Fatorial {
    public int fatorial(int num){
        if(num < 0){
            System.out.println("Erro, digite um número inteiro positivo");
            return 0;
        }
        int fatorial = 1;
        for(long i = 1; i <= num; i++){
            fatorial *= i;
        }
        return fatorial;
    }
}

