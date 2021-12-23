// Beecrowd 1002 | Área do Círculo

/* 
A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:

- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

Entrada
A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.
*/
import java.util.Scanner; 

public class Beecrowd1002 {
    public static void main(String[] Args){
        //area = n.raio -> area = 3.14159
        Scanner intput=new Scanner(System.in); //Utilizando função Scanner
        double raio=intput.nextDouble(); //Declarando intput na variável raio 
        double calculation=3.14159*(Math.pow(raio,2)); //Calculei utilizando a função Math.pow para elevar o raio ao quadrado 
        System.out.printf("A=%.4f\n", calculation); //Output
    } 
}
