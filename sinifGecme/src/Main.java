import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turk, kimya, muzik;
        double ort;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz : ");
        mat = input.nextInt();
        if (mat>=0 && mat<=100){
        }
        else{
            System.out.println("Lütfen 0 ile 100 arasında değer giriniz ! Farklı değer girerseniz hesaplamaya alınmayacaktır !");
            mat =0;

        }
        System.out.println("Fizik Notunuzu Giriniz : ");
        fizik = input.nextInt();
        if (fizik>=0 && fizik<=100){
        }
        else{
            System.out.println("Lütfen 0 ile 100 arasında değer giriniz ! Farklı değer girerseniz hesaplamaya alınmayacaktır !");
            fizik =0;

        }
        System.out.println("Türkçe Notunuzu Giriniz : ");
        turk = input.nextInt();
        if (turk>=0 && turk<=100){
        }
        else{
            System.out.println("Lütfen 0 ile 100 arasında değer giriniz ! Farklı değer girerseniz hesaplamaya alınmayacaktır !");
            turk =0;

        }
        System.out.println("Kimya Notunuzu Giriniz : ");
        kimya = input.nextInt();
        if (kimya>=0 && kimya<=100){
        }
        else{
            System.out.println("Lütfen 0 ile 100 arasında değer giriniz ! Farklı değer girerseniz hesaplamaya alınmayacaktır !");
            kimya =0;

        }
        System.out.println("Müzik Notunuzu Giriniz : ");
        muzik = input.nextInt();
        if (muzik>=0 && muzik<=100){
        }
        else{
            System.out.println("Lütfen 0 ile 100 arasında değer giriniz ! Farklı değer girerseniz hesaplamaya alınmayacaktır !");
            muzik =0;

        }
        ort =(mat+fizik+turk+kimya+muzik)/5;
        if (ort <55){
            System.out.println("Kaldınız ");
        }
        else {
            System.out.println("Geçtiniz ");
        }
        System.out.println("Ortalamanız : " +ort);

    }
}