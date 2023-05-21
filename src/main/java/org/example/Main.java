package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userNama,password;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adını giriniz:");
        userNama=inp.nextLine();
        System.out.print("Şifrenizi giriniz:");
        password=inp.nextLine();

        if (userNama.equals("Ayetullah")&& password.equals("Karabulut")){
            System.out.println("Hoşgeldiniz :)");
        }else {
            System.out.println("Giriş Başarısız");
        }

    }
}