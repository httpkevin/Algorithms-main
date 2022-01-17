// Beecrowd 1010 | Cálculo Simples
/*
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.
*/

import java.util.Scanner;

public class Beecrowd1010 {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        
        int Codigo1 = Input.nextInt();
        int NumeroPecas1 = Input.nextInt();
        double ValorUnitarioPecas1 = Input.nextDouble();

        int Codigo2 = Input.nextInt();
        int NumeroPecas2 = Input.nextInt();
        double ValorUnitarioPecas2 = Input.nextDouble();
        
        double Calculo = (ValorUnitarioPecas1*NumeroPecas1) + (ValorUnitarioPecas2*NumeroPecas2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", Calculo);
    }    
}
