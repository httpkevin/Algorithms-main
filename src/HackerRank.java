import java.util.Scanner;

public class HackerRank{
    public static void main(String[] args) {
       
       Scanner entrada=new Scanner(System.in);
       int peca, peca2, quantidade, quantidade2;
       double unitaria, unitaria2;
       
       peca=entrada.nextInt();
       quantidade=entrada.nextInt();
       unitaria=entrada.nextInt();

       peca2=entrada.nextInt();
       quantidade2=entrada.nextInt();
       unitaria2=entrada.nextInt();
              
       double soma=(unitaria*quantidade)+(unitaria2*quantidade2); 
        
       System.out.printf("VALOR A PAGAR: R$ %.2f\n", soma);
    }
}

