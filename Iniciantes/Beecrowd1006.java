// Beecrowd 1006 | Média 2 
/*
Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).
*/

import java.util.Scanner;

public class Beecrowd1006{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double A=input.nextDouble();
        double B=input.nextDouble();
        double C=input.nextDouble();
        double MEDIA=((2 * A) + (3 * B) + (5 * C))/10;
        System.out.println(String.format("MEDIA = %.1f", MEDIA)); 
    }
}