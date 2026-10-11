package level1;
import java.util.Scanner;
public class KonversiNilai {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai kamu: ");
        Double nilai = input.nextDouble();
       
        if (nilai >= 60)
            System.out.print("Lulus");
        else 
            System.out.print("Tidak lulus");
        
        input.close();
    }
}
