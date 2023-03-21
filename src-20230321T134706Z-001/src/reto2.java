
import java.util.Scanner;
public class Reto2 {
    public void main(String [] args){
    double gradosk=350;
    double resultado;
    
    Scanner lectura= new Scanner(System.in);
    resultado=gradosk - 273.15;
    System.out.println("la temperatura correcta es "+ resultado);
    lectura.close();
    }
    }