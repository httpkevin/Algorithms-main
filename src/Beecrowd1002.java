// Beecrowd 1002 | Área do Círculo 
import java.util.Scanner; 

public class Beecrowd1002 {
    public static void main(String[] Args){
        //area = n.raio -> area = 3.14159
        Scanner intput=new Scanner(System.in);
        double raio=intput.nextDouble(); 
        double area=3.14159*(raio*2);
        double calculation=3.14159*(Math.pow(raio,2));
        System.out.printf("A=%.4f\n", calculation);
    } 
}
