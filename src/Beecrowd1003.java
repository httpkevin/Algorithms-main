// Beecrowd 1003 | Soma Simples 

/* 
Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.

O arquivo de entrada contém 2 valores inteiros.
*/

import java.util.Scanner;

public class Beecrowd1003 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int A=input.nextInt();
        int B=input.nextInt();
        int Soma=A+B;
        System.out.println("SOMA = "+Soma); 
    }    
}
