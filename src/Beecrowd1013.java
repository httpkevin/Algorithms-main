// Beecrowd 1012 | O maior 
/*
Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:

MaiorAB=(a+b+abs(a-b))
        -------------
              2

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".


*/

import java.util.Scanner;

public class Beecrowd1013 {
    public static void main(String[] args){ 
        //Recebe os dados de entrada 
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        //Processa as condições
        if ( a > b && a > c) { // Se "a" for > que "b" e "c" então: "a" eh o maior
            System.out.println(a + " eh o maior"); //Retorno da condição
        } else if(b > c){ // "b" não é > que "a" e "c" então "b" pode ser > que "c" se ele for > então: "b" eh o maior)
                System.out.println(b + " eh o maior"); //Retorno da condição
        } else { // "c" é resultado da unica condição possível
            System.out.println(c + " eh o maior"); //Retorno da condição
        }        
    }
}

