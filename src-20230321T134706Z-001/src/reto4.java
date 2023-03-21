import java.lang.Math;
import java.util.Scanner;

public class Reto4 {

    public static void main(String[] args) {
  
        String nombre;
        int montoapuesta;
        String resultado;
        int respuesta;
        String piedra = "1";
        String papel = "2";
        String tijera = "3";
       

        Scanner lectura = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        nombre = lectura.next();
        System.out.println("ingrese el monto de su apuesta");
        montoapuesta = lectura.nextInt();

        if (montoapuesta > 1000) {
            System.out.println(" elige num1 piedra / num2 papel / num3 tijera ");
            respuesta = lectura.nextInt();
            int númeroAleatorio=(int)(Math.random()*3+1);
            if(respuesta==2 && númeroAleatorio==1){
                
                System.out.println(" Has ganado contra la maquina ");
                respuesta=montoapuesta*2;
                
    System.out.println("apostador" +nombre+"usted ha ganado con "+respuesta+"y ha duplicado su ganancia con un total de"+respuesta);

            }
            else if(respuesta==1 && númeroAleatorio==3){
                System.out.println(" Has ganado contra la maquina ");
                respuesta=montoapuesta*2;
                
    System.out.println("apostador" +nombre+"usted ha ganado con "+respuesta+"y ha duplicado su ganancia con un total de");
            }
            else if(respuesta==númeroAleatorio){
                System.out.println(" Has empatado contra la maquina ");
                respuesta=montoapuesta*2;
                
    System.out.println("apostador" +nombre+"usted ha ganado con "+respuesta+"y ha duplicado su ganancia con un total de");
            }
            else{ System.out.println(" Has perdido contra la maquina ");}
            
        }
         
        else{
            System.out.println(" la apuesta debe ser mayor a 1000 ");
        }

        lectura.close();

    }

}
