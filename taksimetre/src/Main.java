import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double mesafe, tutar;
        int acilis =10;
        int x = 20;

        Scanner input = new Scanner(System.in);
        System.out.println("Gidilen mesafeyi giriniz: ");
        mesafe = input.nextDouble();

        tutar = (mesafe*2.20)+acilis;

        double min = (tutar<20)?x:tutar;

        System.out.println("Ödenecek tutar: " +min);
    }
}
