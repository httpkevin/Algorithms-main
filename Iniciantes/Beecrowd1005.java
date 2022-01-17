// Beecrowd 1005 | Média 1
/*
Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 2 valores com uma casa decimal cada um.

*/
import java.util.Scanner;

public class Beecrowd1005{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double A=input.nextDouble();
        double B=input.nextDouble();
        double MEDIA=((3.5 * A) + (7.5 * B))/11;
        System.out.println(String.format("MEDIA = %.5f", MEDIA)); 
    }
}
