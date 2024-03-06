import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double sayi, tutar, fiyat, kdv;

        Scanner input = new Scanner(System.in);
        System.out.println("KDV'li tutarı hesaplanacak sayıyı giriniz: ");
        sayi = input.nextDouble();

        kdv = (sayi > 1000) ? 0.08: 0.18;
        tutar = sayi * kdv;
        fiyat = sayi + tutar;

        System.out.println("KDV'siz fiyat: " +sayi);
        System.out.println("KDV'li fiyat: " +fiyat);
        System.out.println("KDV tutarı: " +tutar);





    }

}