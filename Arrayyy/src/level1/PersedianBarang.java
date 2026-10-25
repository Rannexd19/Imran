package level1;

public class PersedianBarang {
    public static void main(String[] args) {
        /// Array stock
        int stock[] = {12,8,15,16};

        /// Menampilkan stock pertama dan Terakhir
        System.out.println("Stock Pertama : "+ stock[0]);
        System.out.println("Stock Terakhir : "+ stock[3]);

        /// Mengubah stock ke 2 menjadi 10
        stock[1] = 10;

        /// Menampilkan seluruh produk setelah perubahan
        System.out.println("Stock setelah dirubah: ");
        for (int i = 0; i <= stock.length; i++) {
            System.out.println(stock[i]);
            
        }
        /// Apa yang terjadi jika program mengakses stock[4]?
        /// yang terjadi adalah program akan mengalami error karena nilai stock array tidak lebih dari 5 variabel
        /// karena array membaca variabel mulai dari 0 
    }
}
