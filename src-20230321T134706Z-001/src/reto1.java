import java.util.Scanner;

public class Reto1 {
    public void main(String [] args){
    String nombremama;
    String nombrebebe;
    int edadbebe=0;
    int pesobebe;
    int dosisvacuna;
    Scanner lectura = new Scanner(System.in);
    System.out.println("ingrese el nombre de la mamá ");
    nombremama= lectura.next();
    System.out.println("ingrese el nombre del bebe ");
    nombrebebe= lectura.next();
    System.out.println("ingrese el peso del bebe "+10);
    pesobebe=lectura.nextInt();
    System.out.println("ingrese la edad del bebe " +(edadbebe*10));
    edadbebe=lectura.nextInt();
    
    dosisvacuna=(pesobebe+10)/edadbebe*10;
    
    
    System.out.println("la dosis de la vacuna del bebe es"+ dosisvacuna);
    lectura.close();
    }
    }