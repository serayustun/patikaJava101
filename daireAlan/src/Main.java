import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double r, pi=3.14, alan, cevre, merkezAci;

        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz: ");
        r = input.nextDouble();

        alan = pi*r*r;
        cevre = 2*pi*r;

        System.out.println("Merkez açıyı giriniz: ");
        merkezAci = input.nextDouble();
        double daireDilimiAlani = (pi*(r*r)*merkezAci)/360;

        System.out.println("Dairenin alanı: " +alan);
        System.out.println("Dairenin çevresi: " +cevre);
        System.out.println("Daire diliminin alanı: " +daireDilimiAlani);

    }
}
