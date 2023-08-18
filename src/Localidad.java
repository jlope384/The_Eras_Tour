import java.util.Scanner;
import java.util.Random;

public class Localidad {
    private int Localidad1 = 100;
    private int Localidad5 = 500;
    private int Localidad10 = 1000;
    

    public int getLocalidad1() {
        return this.Localidad1;
    }
    public int getLocalidad5() {
        return this.Localidad5;
    }
    public int getLocalidad10() {
        return this.Localidad10;
    }
    public static void SelectLocalidad(){
        Random random = new Random();
        int RandomNum = random.nextInt(3)+1;
        System.out.println("Numero Random: " + RandomNum);

    }
