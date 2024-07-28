package Basic;
import java.util.Scanner;
public class UsernamePassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName,Userpassword,name="patika",password="dev123";

        System.out.println("Kullanıcı adını giriniz: ");
        userName = input.nextLine();

        System.out.println("Şifrenizi giriniz: ");
        Userpassword = input.nextLine();

        if (userName.equals(name) && Userpassword.equals(password)) {  //Doğrulama yapılıyor
            System.out.println("Giriş Yaptınız");
        } else {
            System.out.println("Bilgileriniz yanlış");
            if(!Userpassword.equals(password)){  //Şifre yanlış ise şifreyi değiştirmek için soruyor
                System.out.println("Şifrenizi sıfırlamak ister misiniz? ");
                System.out.println("1-Evet\n" +
                        "2-Hayır");
                int choice = input.nextInt();
                if(choice == 1){   //Şifreyi değiştirmek istiyorsa buraya girecek
                    System.out.println("Eski şifre: " + password);
                    System.out.println("Yeni Şifrenizi girin");
                    String newPassword = input.next();
                    if(password.equals(newPassword)){   //Yeni şifre eski şifreyle aynıysa
                        System.out.println("Şifreniz oluşturulmadı,lütfen başka bir şifre giriniz.");
                    }else{
                        System.out.println("Şifreniz oluşturuldu");
                    }
                }
            }
        }  
    }
}
