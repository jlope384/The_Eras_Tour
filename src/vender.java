// Definición de la clase vender
public class vender {
    // Variables de instancia
    int ticketCount; // Contador de boletos
    int presupuesto; // Presupuesto

    // Constructor de la clase
    public vender(int ticketCount, int presupuesto) {
        // Inicialización de las variables de instancia con los valores proporcionados
        this.ticketCount = ticketCount;
        this.presupuesto = presupuesto;
    }

    // Método para obtener el contador de boletos
    public int getTicketCount() {
        return ticketCount;
    }

    // Método para obtener el presupuesto
    public int getPresupuesto() {
        return presupuesto;
    }

    // Método para validar boletos y presupuesto
    public boolean validateTicket(int ticketCount, int presupuesto) {
        // Verificar si el contador de boletos o el presupuesto son menores o iguales a
        // cero
        if (ticketCount <= 0 || presupuesto <= 0) {
            return false; // Si uno de los valores es inválido, retorna falso
        }
        return true; // Si ambos valores son válidos, retorna verdadero
    }
}
