import java.util.Scanner;

public class Comprador {
    private String name;
    private String email;
    private int n_tickets;
    private int budget;


    public void realizarCompra() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        this.name = sc.nextLine();  // Usar this para asignar a la variable de instancia
        System.out.println("Ingrese su correo");
        this.email = sc.nextLine(); // Opcionalmente, puedes hacer lo mismo para email
        System.out.println("Ingrese el número de tickets que desea comprar");
        this.n_tickets = sc.nextInt(); // Usar this para asignar a la variable de instancia
        System.out.println("Ingrese su presupuesto");
        this.budget = sc.nextInt(); // Usar this para asignar a la variable de instancia
    }

    public String getName() {
        return this.name;
    }

    public int getBudget() {
        return this.budget;
    }

    public int getN_tickets() {
        return this.n_tickets;
    }
}
