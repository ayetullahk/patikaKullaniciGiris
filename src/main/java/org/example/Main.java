package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userNama,password,newPassword,response;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adını giriniz:");
        userNama=inp.nextLine();
        System.out.print("Şifrenizi giriniz:");
        password=inp.nextLine();

        if (userNama.equals("Ayetullah")&& password.equals("Karabulut")){
            System.out.println("Hoşgeldiniz :)");
        }else {
            System.out.println("Giriş Başarısız Şifre sınırlamak için Evet veya Hayır:");
            response=inp.nextLine();
            if (response.equals("Evet")){
                System.out.print("Yeni Şifrenizi giriniz:");
                newPassword=inp.nextLine();
                if (newPassword.equals(password) ) {
                    System.out.println("Giriş başarılı Şifre oluşturuldu");
                }else {
                    System.out.println("Yeni şifre eski şifreden farklı olmalıdır");
                }

            }
        }

    }
}