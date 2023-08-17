import java.util.Random;

public class Ticket {

    private static int ticket_id;
    private int min;
    private int max;

    public  boolean validateTicket(int ticket, int min, int max){ // este método es para validar el ticket
        Random rand = new Random();

        min = rand.nextInt((15000), 1);
        max = rand.nextInt((15000), 1);

        if(ticket_id >= min && ticket_id <= max){
            return true; // si el ticketid está entre el rango de min y max, entonces es válido y retorna true
        }
        else{
            return false; // si no, retorna false
        }
        
    }




    
}
