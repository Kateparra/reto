import java.util.Scanner;
public class reto7 {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        String nombre, eleccionUsuario;
        int apuesta, total=0,eleccionContador,dinero,i=0,respuesta,acumulador=0;
        
        System.out.println("Ingrese su nombre");
        nombre = lect.next();
        System.out.println("Ingrese su cantidad de dinero");        
        dinero = lect.nextInt();

        do {
        System.out.println("Ingrese su apuesta");
        apuesta = lect.nextInt(); 
            if (apuesta>=dinero) {
            System.out.println("Elige piedra, papel o tijera:");
            eleccionUsuario = lect.next();
            eleccionContador = (int)Math.floor(Math.random()*3) ;
            System.out.println(eleccionContador);

                if (elecUsua.equals("piedra")) {
                    if (elecC==1) {
                    System.out.println("Jugador "+nombre+" ha salido papel, por lo tanto ganó la máquina.");
                    acumulador=acumulador-apuesta;
                    } else if(eleccionContador==2) {
                    System.out.println("Jugador "+nombre+" ha salido piedra, por lo tanto es empate.");
                    acumulador=  acumulador*1;
                    } else {
                    total=apuesta*2;
                    acumulador=acumulador+total;
                    System.out.println("Jugador "+nombre+ " ha salido tijera, usted ha ganado.");
                    }

                } else if (elecUsua.equals("papel")) {
                    if (elecC==1) {
                    System.out.println("Jugador "+nombre+" ha salido tijera, por lo tanto ganó la máquina.");
                    acumulador=acumulador-apuesta;
                    } else if(elecC==2) {
                    System.out.println("Jugador "+nombre+" ha salido papel, por lo tanto es empate.");
                    acumulador=  acumulador*1;
                    } else {
                    total=apuesta*2;
                    System.out.println("Jugador "+nombre+ "ha salido piedra, usted ha ganado.");
                    acumulador=  acumulador+total;
                    }

                } else if (elecUsua.equals("tijera")) {
                    if (elecC==1) {
                    System.out.println("Jugador "+nombre+" ha salido piedra, por lo tanto ganó la máquina.");
                    acumulador=acumulador-apuesta;
                    } else if(eleccionContador==2) {
                    System.out.println("Jugador "+nombre+" ha salido tijera, por lo tanto es empate.");
                    acumulador=acumulador*1;
                    } else {
                    total=apuesta*2;
                    System.out.println("Jugador "+nombre+ "ha salido papel, usted ha ganado.");
                    acumulador=acumulador+total;
                    }
                }
            } else {
            System.out.println("La apuesta debe ser mayor a la cantidad de dinero que tiene");
            }
        i++;
        System.out.println("¿Desea jugar de nuevo?\n 1.Si\n 2.No");
        respuesta=lect.nextInt();
        } while (respuesta==1);
        
        System.out.println("Jugador "+nombre+" el juego ha finalizado");
        System.out.println("Usted ha jugado: "+i+" veces");
        System.out.println("Ha acumulado: "+acumulador+" pesos. ¡Felicidades!");
        lectura.close();
    }
}

