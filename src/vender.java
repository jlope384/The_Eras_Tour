public class vender {
    int ticketCount;
    int presupuesto;

    public vender(int ticketCount, int presupuesto) {
        this.ticketCount = ticketCount;
        this.presupuesto = presupuesto;
    }

    private int getTicketCount() {
        return ticketCount;

    }

    private int getPresupuesto() {
        return presupuesto;
    }

    private boolean validateTicket(int ticketCount, int presupuesto) {
        if (ticketCount <= 0) {
            return false;
        }
        if (presupuesto <= 0) {
            return false;
        }
        return true;
    }
}
