package level1;
public class DaftarNilaiMahasiswa {
    public static void main(String[] args) {
        /// Membuat Nilai Array 
        int Nilai[] = {80,75,90,65,85};

        /// Menampilkan semua nilai
        for (int i = 0; i < Nilai.length; i++) {
            System.out.println("Nilai Mahasiswa ke- " + (i+1) + " Adalah: " + Nilai[i]);
            
        }
        /// Menampilkan nilai indeks ke 2
        System.out.println("Nilai mahasiswa pada indeks 2 adalah: " + Nilai[2]);
        
        /// Menampilkan jumlah mahasiswa 
        System.out.println("Jumlah Mahasiswa: " + Nilai.length);
            
    }

}
