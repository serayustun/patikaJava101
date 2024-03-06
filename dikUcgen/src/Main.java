import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b;
        double c;

        Scanner input = new Scanner(System.in);
        System.out.println("1.Kenar uzunluğunu giriniz: ");
        a = input.nextInt();

        System.out.println("2.Kenar uzunluğunu giriniz: ");
        b = input.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs: " +c);

        double alan = (a*b)/2;
        double cevre = (a+b+c);

        System.out.println("Üçgenin alanı: " +alan);
        System.out.println("Üçgenin çevresi: " +cevre);



    }
}