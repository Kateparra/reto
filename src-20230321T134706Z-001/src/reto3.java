import java.lang.Math;
import java.util.Scanner;

public class Reto3 {
public void main(String [] args){
String nombre;
String respuesta;
int montoapuesta;
String resultado;
String coincide="si";
String nocoincide="no";

Scanner lectura= new Scanner(System.in);

System.out.println("ingrese su nombre");
nombre=lectura.next();

System.out.println("ingrese el monto de su apuesta");
montoapuesta=lectura.nextInt();
if(montoapuesta>1000){
System.out.println("elija cara o sello");
respuesta=lectura.next();
int númeroAleatorio=(int)(Math.random()*25+1);
}
else if(montoapuesta<1000){
System.out.println("elija un monto mayor a 1000");
}
else{
System.out.println("el jugador gano" +coincide+ "el jugador perdio " +nocoincide);


lectura.close();
}


}
}