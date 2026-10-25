package level4;

public class Memprediksi_output_dan_menemukanBug {
 public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        int[] awal = data.clone();


        for (int i = 0; i < data.length; i++) {
        data[i] = awal[i] + awal[data.length - 1 - i];
        }

        System.out.println(java.util.Arrays.toString(data));



    }

}

///1. Apa output program?
///  - setelah dirun output menampilkan: [6, 6, 6, 10, 11]
///2. Apakah program benar-benar menghasilkan pasangan nilai yang simetris?
///  - tidak hasilnya tidak simetris karena nilkai array diubah saat perulangan berlangsung
///3. Mengapa perubahan pada elemen awal dapat memengaruhi perhitungan elemen berikutnya?
///  -karena nilai yang sudah berubah dibaca kembalioleh perulangan shingga hasilnya berbeda dari nilai awal.
///4. Rancang perbaikan agar setiap pasangan dihitung berdasarkan nilai awal array.
///  -membuat salinan/clone agar setiap penjumlahan menggunakan nilai awal dan menghasilkan [6, 6, 6, 6, 6]