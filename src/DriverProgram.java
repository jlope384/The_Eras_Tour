import java.util.Scanner;

public class DriverProgram {

    public static void main(String[] args) {
        boolean keeploop = true;

        while (keeploop == true) {
            System.out.println("---------¡BIENVENIDO AL ERAS TOUR!---------");
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Nuevo comprador");
            System.out.println("2. Nuevo solicitud de tickets");
            System.out.println("3. Consultar disponibilidad total");
            System.out.println("4. Consultar disponibilidad por localidad");
            System.out.println("5. Reporte de caja");
            System.out.println("6. Código Especial");
            System.out.println("7. Salir");

            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            
            switch(option){

                case 1:
                    Comprador comprador = new Comprador();
                    Ticket ticket = new Ticket();
                    comprador.realizarCompra();
                    System.out.println("ID de ticket: "+comprador.getTicket_id());
                    if (ticket.validateTicket(comprador.getTicket_id(), 1, 15000)){
                        System.out.println("Su ticket  es apto para comprar boletos.");
                        comprador.canBuy = true;
                    }else{
                        System.out.println("Su ticket no es apto para comprar boletos.");
                        comprador.canBuy = false;
                    }

                    
                
                    break;
                case 2: 
                    continue;
                case 3:
                    continue;
                case 4:
                    continue;
                case 5:
                    continue;
                case 6:
                    SpecialTicket specialTicket = new SpecialTicket();
                    System.out.println("Ingrese un número especial: ");
                    int n = sc.nextInt();
                    if (specialTicket.isFibonacci(n)){
                        System.out.println("El código es correcto. ");
                        System.out.println("Tiene acceso a un espacio en la localidad 10 a $20,000.00");
                    }else{
                        System.out.println("El código está incorrecto.");
                    }

                case 7:
                    System.out.println("¡Gracias por usar Eras Tour!");
                    keeploop = false;
                }
        }
    }
    
}
