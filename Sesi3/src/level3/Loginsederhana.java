package level3;
import java.util.Scanner;

public class Loginsederhana {
   public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    String usernameBenar = "admin";
    String passwordBenar = "12345";

    System.out.print("Masukkan Username: ");
    String inputUsername = input.nextLine();

    System.out.print("Masakukkan Password: ");
    String inputPassword = input.nextLine();

        if (inputUsername.equals(usernameBenar) && inputPassword.equals(passwordBenar)) 
        System.out.print("Login Berhasil");
        else if (!inputUsername.equals(usernameBenar) && inputPassword.equals(passwordBenar))
        System.out.print("Username Salah");
        else if (inputUsername.equals(usernameBenar) && !inputPassword.equals(passwordBenar))
            System.out.print("Password Salah");
        else {
            System.out.print("Username dan Password Salah");

        }
        input.close();
    }
}

