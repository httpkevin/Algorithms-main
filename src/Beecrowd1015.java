// Beecrowd 1015 | Distância entre dois pontos 

/*
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

Distancia = V(x2 - x1)*2*2 + (y2 -y1)*2*2

Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.

*/

import java.util.Scanner;

public class Beecrowd1015 {
    
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        double x1 = Input.nextDouble();
        double y1 = Input.nextDouble();
        double x2 = Input.nextDouble();
        double y2 = Input.nextDouble();

        double Calculo = (( x2 - x1 ) * ( x2 - x1 ) + ( y2 - y1) * ( y2 - y1));
        double Distancia = Math.sqrt(Calculo);
        System.out.printf("%.4f\n", Distancia); 
    }
}
