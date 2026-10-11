package level2;

import java.util.Scanner;

public class KategoriUmur {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        System.out.print("Berapa umur anda? ");
        Double umur = input.nextDouble();
        
        if (umur >= 0 && umur <= 5)
            System.out.print("Anda masih Balita");
        else if (umur >= 6 && umur <= 12) 
            System.out.print("Anda masih Anak anak");
        else if (umur >= 13 && umur <= 17)
            System.out.print("Anda sudah Remaja");
        else if (umur >= 18 && umur <= 59)
            System.out.print("Anda sudah Dewasa");
        else if (umur >= 60)
            System.out.print("Anda sudah Lansia");

        input.close();
    }
}