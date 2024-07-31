import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double distance, price;
        int age, type;

        Scanner input = new Scanner(System.in);

        System.out.println("Mesafeyi km türünden giriniz:");
        distance = input.nextDouble();
        System.out.println("Yaşınızı Giriniz:");
        age = input.nextInt();
        System.out.println("Yolculuk Tipini Giriniz (1=> Tek yön, 2=> Gidiş Dönüş):");
        type = input.nextInt();


        if (distance>0 && age>0 && (type==1 || type==2)) {
            price = distance * 0.10;

            if (age < 12) {
                price = (price - (price * 0.50));

            } else if (age >= 12 && age <= 24) {
                price = (price - (price * 0.10));

            }
            else if (age >= 65){
                price = (price - (price * 0.30));

            }
            else {
                price = distance * 0.10;
            }
            if (type==2){
                price = (price - (price * 0.20))*2;
            }

            System.out.println("Toplam Tutar:" + price);
        }
        else {
            System.out.println("Hatalı Veri Girdiniz !");
        }


    }
}