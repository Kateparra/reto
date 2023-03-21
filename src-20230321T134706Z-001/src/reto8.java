import java.util.Scanner;
public class reto8 {
    public static void main(String[] args) {
       Scanner lectura=new Scanner(System.in);
       int num, restantes=10, eleccion; 
       num=(int)Math.floor(Math.random()*100);

       System.out.println(num);
       System.out.println("Adivina un número del 1 al 100, tiene 10 intentos,mucha Suerte");

       do{
        System.out.println("Intento #"+(11-restantes)+": ");
        eleccion=lect.nextInt();
            if (eleccion==num) {
            System.out.println("Felicidades has adivinado el número \nFueron "+(11-restantes)+" intentos.");
            return;
            } else if (eleccion<num) {
            System.out.println("El número a adivinar es mayor, vuelve a intentarlo");
            } else if (eleccion>num){
            System.out.println("El número a adivinar es menor, vuelve a intentarlo");
            }
        restantes--;
       } while(restantes>0);
       
       System.out.println("Lo siento, no adivinaste el número \nl número a adivinar era: "+num);
       lectura.close();
    }
}
