import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);

        System.out.println("Sıcaklık Giriniz: ");
        heat = input.nextInt();

        if (heat < 5){
            System.out.println("Kayak Yapmaya Gidebilirsiniz !");
        }
        else if (5<=heat && heat <=15){
            System.out.println("Sinemaya Gidebilirsiniz !");
        }
        else if (15<heat && heat <=25){
            System.out.println("Pikniğe Gidebilirsiniz !");
        }
        else{
            System.out.println("Yüzmeye Gidebilirsiniz !");
        }


    }
}