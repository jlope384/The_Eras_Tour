import java.util.Random;

public class Localidad {
    private static final int PrecioLocalidad1 = 100;
    private static final int PrecioLocalidad5 = 500;
    private static final int PrecioLocalidad10 = 1000;

    private int TOTLocalidad1 = 20;
    private int TOTLocalidad5 = 20;
    private int TOTLocalidad10 = 20;
    private int PrecioTOT = 0;

    public int getTOTLocalidad1() {
        return TOTLocalidad1;
    }

    public int getTOTLocalidad5() {
        return TOTLocalidad5;
    }

    public int getTOTLocalidad10() {
        return TOTLocalidad10;
    }

    public int getPrecioLocalidad1() {
        return PrecioLocalidad1;
    }

    public int getPrecioLocalidad5() {
        return PrecioLocalidad5;
    }

    public int getPrecioLocalidad10() {
        return PrecioLocalidad10;
    }

    public int getPrecioTOT() {
        return PrecioTOT;
    }

    public int[] SelectLocalidad(int cantBoletos) {
        Random random = new Random();
        int RandomNum = random.nextInt(3) + 1;
        System.out.println("Numero Random: " + RandomNum);
        int[] retunrs;
        if (RandomNum == 1 && TOTLocalidad1 >= cantBoletos) {
            TOTLocalidad1 = TOTLocalidad1 - cantBoletos; // actualizar cantidad de localizacion
            PrecioTOT = PrecioLocalidad1 * cantBoletos; // Precio Por cantidad de voletos
            retunrs = new int[] { PrecioLocalidad1, TOTLocalidad1, PrecioTOT };// sacado por chatGPT, forma de hacer
                                                                               // return
        }

        else if (RandomNum == 2 && TOTLocalidad5 >= cantBoletos) {
            TOTLocalidad5 = TOTLocalidad5 - cantBoletos;// actualizar cantidad de localizacion
            PrecioTOT = PrecioLocalidad5 * cantBoletos; // Precio Por cantidad de voletos
            retunrs = new int[] { PrecioLocalidad5, TOTLocalidad5 };// sacado por chatGPT, forma de hacer return
        }

        else if (RandomNum == 3 && TOTLocalidad10 >= cantBoletos) {
            TOTLocalidad10 = TOTLocalidad10 - cantBoletos;// actualizar cantidad de localizacion
            PrecioTOT = PrecioLocalidad10 * cantBoletos; // Precio Por cantidad de voletos
            retunrs = new int[] { PrecioLocalidad10, TOTLocalidad10 };// sacado por chatGPT, forma de hacer return
        } else {
            System.out.println("No hay asientos disponibles.");
            retunrs = new int[] { 0, 0 }; // O lanza una excepción
        }
        return retunrs; // forma de hacer return sacada por ChatGPT
    }

    public void comprarBoletos(int nBoletos, int i) {
    }
}
