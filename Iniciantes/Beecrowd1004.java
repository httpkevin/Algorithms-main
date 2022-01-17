// Beecrowd 1004 | Produto Simples  
/*
Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente.   

Entrada
O arquivo de entrada contém 2 valores inteiros.

*/

import java.util.Scanner;

public class Beecrowd1004 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int PROD1=input.nextInt();
        int PROD2=input.nextInt();
        int PROD=PROD1*PROD2;
        System.out.println("PROD = " + PROD);
    }    
}
