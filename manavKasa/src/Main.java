import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double a,e,d,m,p;
        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, pat=5.00;

        Scanner input = new Scanner(System.in);

        System.out.println("Armut kaç kilo ? : ");
        a = input.nextDouble();
        System.out.println("Elma kaç kilo ? : ");
        e = input.nextDouble();
        System.out.println("Domates kaç kilo ? : ");
        d = input.nextDouble();
        System.out.println("Muz kaç kilo ? : ");
        m = input.nextDouble();
        System.out.println("Patlıcan kaç kilo ? : ");
        p = input.nextDouble();

        double tutar = ((armut*a)+(elma*e)+(domates*d)+(muz*m)+(pat*p));
        System.out.println("Toplam tutar: " +tutar);



    }
}
