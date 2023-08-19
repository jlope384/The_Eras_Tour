
import java.util.Random;

public class Localidad {
    private int PrecioLocalidad1 = 100;
    private int PrecioLocalidad5 = 500;
    private int PrecioLocalidad10 = 1000;

    private int TOTLocalidad1 = 20;
    private int TOTLocalidad5 = 20;
    private int TOTLocalidad10 = 20;

    public int getTOTLocalidad1() {
        return this.TOTLocalidad1;
    }

    public int getTOTLocalidad5() {
        return this.TOTLocalidad5;
    }

    public int getTOTLocalidad10() {
        return this.TOTLocalidad10;
    }

    public int getPrecioLocalidad1() {
        return this.PrecioLocalidad1;
    }

    public int getPrecioLocalidad5() {
        return this.PrecioLocalidad5;
    }

    public int getPrecioLocalidad10() {
        return this.PrecioLocalidad10;
    }

    public int[] SelectLocalidad(int cantVoletos) {
        Random random = new Random();
        int RandomNum = random.nextInt(3) + 1;
        System.out.println("Numero Random: " + RandomNum);

        if (RandomNum == 1) {
            TOTLocalidad1 = TOTLocalidad1 - cantVoletos;
            int[] returns1 = { PrecioLocalidad1, TOTLocalidad1 };
            return returns1;
        }
        if (RandomNum == 2) {
            TOTLocalidad5 = TOTLocalidad5 - cantVoletos;
            int[] returns5 = { PrecioLocalidad5, TOTLocalidad5 };
            return returns5;
        }
        if (RandomNum == 3) {
            TOTLocalidad10 = TOTLocalidad10 - cantVoletos;
            int[] returns10 = { PrecioLocalidad10, TOTLocalidad10 };
            return returns10;
        }
        if (TOTLocalidad1 == 0 || TOTLocalidad5 == 0 || TOTLocalidad10 == 0) {
            System.out.println("No se encuentran mas asientos disponibles, Buena suerte la proxima ");
        }
    }

    public void comprarBoletos(int nBoletos, int i) {
    }
}
