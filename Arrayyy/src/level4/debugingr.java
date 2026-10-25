package level4;

public class debugingr {
    public static void main(String[] args) {
        int[] scores = {80, 70, 90, 60};
        double total = 0;
        for (int i = 0; i < scores.length; i++) {
        total += scores[i];
        }
        double average = total / scores.length;
        System.out.println(average);

        ///1. Apakah program berjalan dengan benar? Jelaskan.
        ///  - program tidak akan berjalan dengan benar karena perulangan melewati batas indeks array 
        ///2. Temukan seluruh masalah pada kode.
        ///  - i <= scores.length; seharusnya i < scores.length; karena jika <= maka yang dicari indeksnya 4 sedangkan array mulai indeks dari angka 0, sehingga angka 4 tidak termasuk dalam array.
        ///  - int total = 0; sebaiknya menggunakan double untuk sesuatu yang akan kita bagi karena takutnya aknga nya akan desimal.
        ///3. Perbaiki kode agar menghasilkan rata-rata yang tepat.
        /// - tinggal di run
        ///4. Jelaskan mengapa pembagian menggunakan tipe double dapat menjadi penting.
        ///  - Karena tipe double dapat menyimpan angka desimal
        ///5. Apakah mengubah int total menjadi double total saja cukup untuk memperbaiki seluruh masalah?
        /// - tidak karena kondisi perulangan i <= scores.length; tetap menyebabkan program mengakses indkes diluar batas array, jadi tetap ada yang harus di perbaiki menjadi i < scores.length; 
    }
}
