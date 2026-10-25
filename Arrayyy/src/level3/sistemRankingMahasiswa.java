package level3;

public class sistemRankingMahasiswa {
    public static void main(String[] args) {
        int nilaiMahasiswa[] = {78,90,65,90,85,72,95,85};
        int N = nilaiMahasiswa.length;
        for (int i = 0; i < N; i++) {
            for (int a = i + 1; a < N; a++) {
                if (nilaiMahasiswa[i] < nilaiMahasiswa[a]) {
                    int Nilai = nilaiMahasiswa[i];
                    nilaiMahasiswa[i] = nilaiMahasiswa[a];
                    nilaiMahasiswa[a] = Nilai;
                }
            }
        }
        System.out.println("Nilai setelah diurutkan: ");
        for (int i = 0; i < N; i++) {
            System.out.print(nilaiMahasiswa[i] + " ");
        }

        System.out.println("\n\n3 Nilai tertinggi adalah: ");
        int jumlahNilai = 0;
        int nilaiSebelumnya = -1;

        for (int i = 0; i < N; i++) {
            if (nilaiMahasiswa[i] != nilaiSebelumnya) {
                System.out.println(nilaiMahasiswa[i]);
                nilaiSebelumnya = nilaiMahasiswa[i];
                jumlahNilai++;

                if (jumlahNilai == 3) {
                    break;
                }
            }
        }
        System.out.println("Peringkat setiap mahasiswa: ");
        for (int i = 0; i < N; i++) {
            int peringkat = 1;

            for (int a = 0; a < N; a++ ) {
                if(nilaiMahasiswa[a] > nilaiMahasiswa[i]) {
                    peringkat++;
                }
            }
            System.out.println(
                "Mahasiswa yang mendapatkan Nilai " + nilaiMahasiswa[i] + " mendapatkan Peringkat ke: " + peringkat);

        }
    }
}
