// Beecrowd 1024 | Criptografia

/*
Solicitaram para que você construisse um programa simples de criptografia. Este programa deve possibilitar enviar mensagens codificadas sem que alguém consiga lê-las. O processo é muito simples. São feitas três passadas em todo o texto.

Na primeira passada, somente caracteres que sejam letras minúsculas e maiúsculas devem ser deslocadas 3 posições para a direita, segundo a tabela ASCII: letra 'a' deve virar letra 'd', letra 'y' deve virar caractere '|' e assim sucessivamente. Na segunda passada, a linha deverá ser invertida. Na terceira e última passada, todo e qualquer caractere a partir da metade em diante (truncada) devem ser deslocados uma posição para a esquerda na tabela ASCII. Neste caso, 'b' vira 'a' e 'a' vira '`'.

Por exemplo, se a entrada for “Texto #3”, o primeiro processamento sobre esta entrada deverá produzir “Wh{wr #3”. O resultado do segundo processamento inverte os caracteres e produz “3# rw{hW”. Por último, com o deslocamento dos caracteres da metade em diante, o resultado final deve ser “3# rvzgV”.

Entrada
A entrada contém vários casos de teste. A primeira linha de cada caso de teste contém um inteiro N (1 ≤ N ≤ 1*104), indicando a quantidade de linhas que o problema deve tratar. As N linhas contém cada uma delas M (1 ≤ M ≤ 1*103) caracteres.
Saída
Para cada entrada, deve-se apresentar a mensagem criptografada.
*/

import java.util.Scanner;

public class Beecrowd1024 {

    public static void main(String[] args) {

        // Instaciando o Input e lendo o número de caso de testes
        Scanner Input = new Scanner(System.in);
        int N = Input.nextInt();

        // Percorrendo os 'N' Casos de teste
        for (int i =0;  i < N; i++) {

            // Instanciando o StringBuilder para trabalhar mais facilmente a String
            StringBuilder M = new StringBuilder(readLine(Input));

            // Camada 1 (somente caracteres que sejam letras minúsculas e maiúsculas devem ser deslocadas 3 posições para a direita, segundo a tabela ASCII: letra 'a' deve virar letra 'd', letra 'y' deve virar caractere '|' e assim sucessivamente.)
            for (int j = 0; j < M.length(); j++) {
                int code = M.charAt(j);
                if ((code < 65 || code > 90) && (code < 97 || code > 122)) {
                    char c = (char) (code + 3);
                    M.setCharAt(j, c);
                }
            }

            // Camada 2 (a linha deverá ser invertida)
            M.reverse();

            // Camada 3 ( todo e qualquer caractere a partir da metade em diante (truncada) devem ser deslocados uma posição para a esquerda na tabela ASCII. Neste caso, 'b' vira 'a' e 'a' vira '`')
            for (int j = M.length() / 2; j < M.length(); j++) {
                char c = (char) (M.charAt(j) -1);
                M.setCharAt(j, c);
            }

            // Print 
            System.out.println(M.toString());

        }
    
    }

    // Método para ler a String sem bugs de espaçamentos 
    public static String readLine(Scanner leitor) {
        String line = leitor.nextLine();
        while (line.isEmpty())
            line = leitor.nextLine();
        return line;

    }
}