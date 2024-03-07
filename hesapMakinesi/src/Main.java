import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, select;

        Scanner input =new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz: ");
        num1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        num2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme ");
        System.out.println("Seçiminiz: ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Sonuç: " +(num1+num2));
                break;
            case 2:
                System.out.println("Sonuç: " +(num1-num2));
                break;
            case 3:
                System.out.println("Sonuç: " +(num1*num2));
                break;
            case 4:
                System.out.println("Sonuç: " +((num2!=0) ? (num1/num2): "sonsuz" ));
                break;
            default:
                System.out.println("Yanlış seçim yaptınız");
                break;
        }


    }
}