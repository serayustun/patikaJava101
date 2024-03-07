import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword, select;


        Scanner input =new Scanner(System.in);

        System.out.println("Kullanıcı adını giriniz: ");
        userName = input.nextLine();
        System.out.println("Şifrenizi giriniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız");

        }
        else if (!(userName.equals("patika"))&& !(password.equals("java123"))){
            System.out.println("Kullanıcı adı ve Şifre yanlış. Lütfen tekrar deneyiniz !");
        }
        else if (!(userName.equals("patika"))&& (password.equals("java123"))){
            System.out.println("Kullanıcı adı hatalı. Lütfen kontrol edip tekrar deneyiniz !");
        }
        else if ((userName.equals("patika")) && !(password.equals("java123"))) {
            System.out.println("Şifre Yanlış !\nŞifrenizi Unuttuysanız 'A' ya Basınız\nGiriş Ekranına Dönmek için 'B' ye Basınız");
            select = input.nextLine();


            if (select.equals("A") || select.equals("a")) {
                System.out.println("Yeni Şifrenizi Giriniz :");
                newPassword = input.nextLine();
                if (newPassword.equals("java123")) {
                    System.out.println("Yeni Şifreniz Eskisiyle Aynı Olamaz ! Lütfen Tekrar Deneyiniz !");

                } else {
                    System.out.println("Yeni Şifreniz Başarıyla Oluşturuldu");
                }

            } else if (select.equals("B") || select.equals("b")) {
                System.out.println("Giriş Ekranına Yönlendiriliyorsunuz ");

            } else {
                System.out.println("Hatalı Seçim Yaptınız Yalnızca 'A' veya 'B' yi Seçebilirsiniz");
            }

        }

    }
}