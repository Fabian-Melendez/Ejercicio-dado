import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random ronda = new Random ();
        int max = 10;
        int min = 1;
        int num;
        int cont =1;
        int dd1;
        int dd2;
        int sumadd1=0;
        int sumadd2=0;

        num = ronda.nextInt((max - min +1)) +min;
        System.out.println("La cantidad de rondas es "+num);

        for (int i=cont;i <= num; i++){

            Random dado1 = new Random();
            Random dado2 = new Random();
            dd1 = ronda.nextInt((6- 1 + 1)) + 1;
            sumadd1 +=dd1;
            dd2 = ronda.nextInt((6 -1 + 1)) + 1;
            sumadd2 +=dd2;
            System.out.println("dado1 "+dd1+" dado2 "+dd2);
        }
        if (sumadd1>sumadd2){
            System.out.println("el dado que mas sumo fue el dado1");

        }else{
            System.out.println("el dado que mas sumo fue el dado2");
        }
        System.out.println("Dado 1 sumó= "+ sumadd1);
        System.out.println("Dado 2 sumó= "+ sumadd2);
    }
}
