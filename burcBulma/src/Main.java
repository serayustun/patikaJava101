import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day, month;

        Scanner input = new Scanner(System.in);

        System.out.println("Doğduğunuz Ay: ");
        month= input.nextInt();
        System.out.println("Doğduğunuz Gün:");
        day = input.nextInt();

        if ((month==4 && day<=20)||(month==3 && day>=21))
        {
            System.out.println("Koç Burcu");
        }
        else if((month ==5 && day<=21)||(month==4 && day>=21))
        {
            System.out.println("Boğa Burcu");
        }
       else if((month ==6 && day<=22)||(month==5 && day>=22))
        {
            System.out.println("İkizler Burcu");
        }
       else if((month ==7 && day<=22)||(month==5 && day>=23))
        {
            System.out.println("Yengeç Burcu");
        }
       else if((month ==8 && day<=22)||(month==7 && day>=23))
        {
            System.out.println("Aslan Burcu");
        }
       else if((month ==9 && day<=22)||(month==8 && day>=23))
        {
            System.out.println("Başak Burcu");
        }
       else if((month ==10 && day<=22)||(month==9 && day>=23))
        {
            System.out.println("Terazi Burcu");
        }
       else if((month ==11 && day<=21)||(month==10 && day>=23))
        {
            System.out.println("Akrep Burcu");
        }
       else  if((month ==12 && day<=21)||(month==11 && day>=22))
        {
            System.out.println("Yay Burcu");
        }
       else if((month ==1 && day<=21)||(month==12 && day>=22))
        {
            System.out.println("Oğlak Burcu");
        }
       else if((month ==2 && day<=19)||(month==1 && day>=22))
        {
            System.out.println("Kova Burcu");
        }
       else if((month ==3 && day<=20)||(month==2 && day>=220))
        {
            System.out.println("Balık Burcu");
        }

        else {
            System.out.println("Hatalı Bilgi Girdiniz Lütfen Kontrol Ediniz");
        }
    }
}