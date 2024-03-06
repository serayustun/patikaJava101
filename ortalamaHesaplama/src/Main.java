import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,turkce,fizik,kimya,tarih,muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.println("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();

        System.out.println("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        double sonuc =(mat+turkce+fizik+kimya+tarih+muzik)/6;
        System.out.println("Ortalamanız: " + sonuc);

        String basari = sonuc >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(basari);

    }

}