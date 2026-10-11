package level4;

import java.util.Scanner;

public class BiayaParkir {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan lama Parkir: ");
        
        Double DurasiParkir = input.nextDouble();
        int HargaParkir = 5000;

        if (DurasiParkir <= 1) {
            double PengeluaranParkir = HargaParkir * 1;
            System.out.print("Biaya parkir anda selama : " + DurasiParkir + " jam adalah: " + PengeluaranParkir );
            
        }else if (DurasiParkir >= 1) {
            Double PengeluaranParkir = Math.min(20000, 5000 + (DurasiParkir - 1) * 3000);
            System.out.print("Biaya Parkir anda selama : " + DurasiParkir + " jam adalah " + PengeluaranParkir);
        }
        input.close();
            
    }   

}
