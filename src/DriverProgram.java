import java.util.Scanner;

public class DriverProgram {

    public static void main(String[] args) {
        boolean keeploop = true;
        int totL1 = 0;
        int totL5 = 0;
        int totL10 = 0;
        Scanner sc = new Scanner(System.in);
        while (keeploop == true) {
            System.out.println("---------¡BIENVENIDO AL ERAS TOUR!---------");
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Nuevo comprador");
            System.out.println("2. Comprar boletos");
            System.out.println("3. Consultar disponibilidad total");
            System.out.println("4. Consultar disponibilidad por localidad");
            System.out.println("5. Reporte de caja");
            System.out.println("6. Código Especial");
            System.out.println("7. Salir");

            int option = sc.nextInt();

            switch (option) { // este switch es para que el usuario pueda elegir la opción que desea

                case 1: // este case es para que el usuario pueda ingresar sus datos y se le asigne un
                        // ticket
                    Comprador comprador = new Comprador();
                    Ticket ticket = new Ticket();
                    comprador.realizarCompra();
                    System.out.println("ID de ticket: " + comprador.getTicket_id());
                    if (ticket.validateTicket(comprador.getTicket_id(), 1, 15000)) {
                        System.out.println("Su ticket  es apto para comprar boletos.");
                        comprador.canBuy = true;
                    } else {
                        System.out.println("Su ticket no es apto para comprar boletos.");
                        comprador.canBuy = false;
                    }

                    break;
                case 2:
                    comprador = new Comprador();
                    if (comprador.canBuy == true) {
                        System.out.println("¿Cuántos boletos desea comprar?");
                        int nBoletos = sc.nextInt();
                        System.out.println("¿En qué localidad desea comprar los boletos?");
                        System.out.println("1. Localidad 1");
                        System.out.println("2. Localidad 5");
                        System.out.println("3. Localidad 10");
                        int localidad = sc.nextInt();
                        switch (localidad) {
                            case 1:
                                Localidad localidad1 = new Localidad();
                                localidad1.comprarBoletos(nBoletos, 1);
                                break;
                            case 2:
                                Localidad localidad5 = new Localidad();
                                localidad5.comprarBoletos(nBoletos, 5);
                                break;
                            case 3:
                                Localidad localidad10 = new Localidad();
                                localidad10.comprarBoletos(nBoletos, 10);
                                break;
                        }
                    } else {
                        System.out.println("No puede comprar boletos.");
                    }
                    continue;
                case 3:
                    Localidad localidad = new Localidad();
                    totL1 = localidad.getTOTLocalidad1();
                    totL5 = localidad.getTOTLocalidad5();
                    totL10 = localidad.getTOTLocalidad10();

                    System.out.println("Cantidad total: " + (totL1 + totL5 + totL10));
                    continue;
                case 4:
                    System.out.println("Cantidad de asientos en Localidad 1: " + totL1);
                    System.out.println("Cantidad de asientos en Localidad 5: " + totL5);
                    System.out.println("Cantidad de asientos en Localidad 10: " + totL10);
                    continue;
                case 5:
                    System.out.println("Cantidad de asientos vendidos en Localidad 1: " + totL1);
                    continue;
                case 6: // este case es para que el usuario pueda ingresar un código especial y se le
                        // asigne un ticket
                    System.out.println("Ingrese un número especial: ");
                    int n = sc.nextInt();
                    if (SpecialTicket.isFibonacci(n)) {
                        System.out.println("El código es correcto. ");
                        System.out.println("Tiene acceso a un espacio en la localidad 10 a $20,000.00");
                    } else {
                        System.out.println("El código está incorrecto.");
                    }

                case 7: // este case es para que el usuario pueda salir del programa
                    System.out.println("¡Gracias por usar Eras Tour!");
                    keeploop = false;
            }
        }
    }

}
