import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);
        System.out.println("Yıl Giriniz: ");
        year = input.nextInt();

        if (year%4==0 && (year%100!=0 || year%400==0)){
            System.out.println(year + " bir artık yıldır.");

        }
        else{
            System.out.println(year + " bir artk yıl değildir.");
        }

        }
    }
