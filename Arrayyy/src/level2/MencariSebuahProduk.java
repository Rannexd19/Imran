package level2;
import java.util.Scanner;

public class MencariSebuahProduk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int produk[] = {101, 105, 110, 115, 120, 125};
        
        System.out.print("Masukan kode Produk: "  );
        int CariProduk = input.nextInt();

        int indeks = -1;
        int kodeDiperiksa = 0;

        for (int i = 0; i < produk.length; i++) {
            kodeDiperiksa++;

            if (produk[i] == CariProduk) {
                indeks = i;
                break;
            }
        }

        if (indeks != -1) {
            System.out.println("Produk ditemukan");
            System.out.println("Indeks Produk: " + indeks);
        } else {
            System.out.println("Produk Tidak tersedia");
        }

        System.out.println("jumlah kode yang diperiksa adalah: " + kodeDiperiksa);
        input.close();
    }
}
