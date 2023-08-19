import java.util.Scanner;
import java.util.Random;

public class Comprador {// esta es la clase es comprador
    private String name;
    private String email;
    private int n_tickets;
    private int budget;
    private int ticket_id;
    public boolean canBuy;

    public void realizarCompra() { // este código lo que hace es pedir los datos del comprador y
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Ingrese su nombre");
        this.name = sc.nextLine(); // Usar this para asignar a la variable de instancia
        System.out.println("Ingrese su correo");
        this.email = sc.nextLine(); // Opcionalmente, puedes hacer lo mismo para email
        System.out.println("Ingrese el número de tickets que desea comprar");
        this.n_tickets = sc.nextInt(); // Usar this para asignar a la variable de instancia
        System.out.println("Ingrese su presupuesto");
        this.budget = sc.nextInt(); // Usar this para asignar a la variable de instancia
        this.ticket_id = rd.nextInt((15000));
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public int getBudget() {
        return this.budget;
    }

    public int getN_tickets() {
        return this.n_tickets;
    }

    public int getTicket_id() {
        return this.ticket_id;
    }
}
