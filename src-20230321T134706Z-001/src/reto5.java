import java.util.Scanner;
public class reto5 {
   public static void main(String[] args) {
      Scanner lect=new Scanner(System.in);
        int cantidad,precio,total=0,pagar,total1=0,documento, usuario1=1013106777,usuario2=1018479035,usuario3,i=1;
        String empleado,cliente,producto,apellidó,nombre;
        System.out.println("señor cliente, por favor ingrese su nombre");
        cliente=lect.next();
        System.out.println("Ingrese su documento de identidad");
        documento=lect.nextInt();
        if (documento==usuario1 || documento==usuario2 ) {
            System.out.println("Bienvenid@ "+cliente);
            System.out.println("Ingrese el nombre del empleado que realiza la venta");
            empleado=lect.next();
            System.out.println("Ingrese la cantidad de productos a comprar");
            cantidad=lect.nextInt();

            for (i=1;i<=cantidad;i++) {
                System.out.println("Ingrese el nombre del producto "+i);
                producto=lect.next();
                System.out.println("Ingrese el precio del producto");
                precio=lect.nextInt();
                total=total+precio;
                System.out.println("El precio del producto "+i+" es:"+precio);
            }

         System.out.println("El total a pagar es: "+total);   
         System.out.println("¿Con cuánto desea pagar?");
         pagar=lect.nextInt();

            if (pagar<total) {
               total1=total-pagar;
               System.out.println("Querido cliente, no le alcanza para pagar la compra, le hacen falta: "+total1+" pesos");
            } else if (pagar>total) {
               total1=pagar-total;
               System.out.println("Querido cliente, su cambio es: "+total1+" pesos");
            } else {
               System.out.println("gracias por su compra");
            }
        } else {
            System.out.println("Usted no se encuentra en el sistema, por favor registre sus datos");
            System.out.println("Ingrese su documento de identidad");
            usuario3=lectura.nextInt();
            System.out.println("Ingrese su nombre");
            nombre=lectura.next();
            System.out.println("Ingrese su apellido");
            apellido=lectura.next();

            System.out.println("Bienvenid@ "+nombre);
            System.out.println("Ingrese el nombre del empleado que realiza la venta");
            empleadi=lect.next();
            System.out.println("Ingrese la cantidad de productos a comprar");
            cantidad=lect.nextInt();

            for (i=1;i<=cant;i++) {
                System.out.println("Ingrese el nombre del producto #"+i);
                producto=lect.next();
                System.out.println("Ingrese el precio del producto");
                precio=lect.nextInt();
                total=total+precio;
                System.out.println("El precio del producto #"+i+" es:"+precio);
            }

            System.out.println("El total a pagar es: "+total);   
            System.out.println("¿Con cuánto desea pagar?");
            pagar=lect.nextInt();

            if (pagar<total) {
               total1=total-pagar;
               System.out.println("Querido cliente, no le alcanza para pagar la compra, le hacen falta: "+total1+" pesos");
            } else if (pagar>total) {
               total1=pagar-total1;
               System.out.println("Querido cliente, su cambio es: "+total1+" pesos");
            } else {
               System.out.println("Tenga un buen día");
            }        
        }
    lectura.close();    
    }
}
