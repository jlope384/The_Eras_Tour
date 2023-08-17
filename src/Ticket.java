import java.util.Random;

public class Ticket {

    private static int ticket_id;
    private int min;
    private int max;

    public static boolean validateTicket(int ticket, int min, int max){
        Random rand = new Random();

        ticket_id = rand.nextInt((15000), 1);
        min = rand.nextInt((15000), 1);
        max = rand.nextInt((15000), 1);

        if(ticket_id >= min && ticket_id <= max){
            return true;
        }
        else{
            return false;
        }
        
    }




    
}
