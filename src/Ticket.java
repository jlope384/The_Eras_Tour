import java.util.Random;
import java.util.Arrays;

public class Ticket {

    private static int ticket_id;

    public boolean validateTicket(int ticket, int min, int max) { // este método es para validar el ticket
        Random rand = new Random();
        int[] rango = new int[2];
        min = rand.nextInt((15000));
        max = rand.nextInt((15000));
        rango[0] = min;
        rango[1] = max;
        Arrays.sort(rango); // se agregan ambos valores a un array y se ordenan de menor a mayor

        if (ticket_id >= rango[0] && ticket_id <= rango[1]) {
            return true; // si el ticketid está entre el rango de min y max, entonces es válido y retorna
                         // true
        } else {
            return false; // si no, retorna false
        }

    }

}
