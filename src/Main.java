import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random ale= new Random();
        int num;
        num= ale.nextInt((50 - 1 + 1)) +1;
        int op;
        System.out.println("Digite un numero del 1-50");


        for (int i=1;i<=3;i++){
            Scanner teclado = new Scanner(System.in);
            op= teclado.nextInt();
            System.out.println(op);
            if(op>num){
                System.out.println("El número es mas pequeño");
            }else if(op<num){
                System.out.println("El número es mas grande");
            }else {
                System.out.println("Adivinó el número");
            }
        }
        System.out.println("Perdio las 3 oportunidades");
    }
}
