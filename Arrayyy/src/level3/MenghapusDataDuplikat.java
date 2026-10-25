package level3;

public class MenghapusDataDuplikat {
    public static void main(String[] args) {
        
        int peserta[] = {101, 102, 101, 103, 102, 104, 105, 103};
        int N = peserta.length;
        int unik[] = new int[N];
        int jumlahUnik = 0;

        System.out.println("Nomor peserta duplikat:");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (peserta[i] == peserta[j]) {
                    System.out.println(peserta[i]);
                    break;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            boolean ada = false;

            for (int j = 0; j < jumlahUnik; j++) {
                if (peserta[i] == unik[j]) {
                    ada = true;
                    break;
                }
            }

            if (!ada) {
                unik[jumlahUnik] = peserta[i];
                jumlahUnik++;

            }
        }

        System.out.println("\nNomor Unik: ");
        for (int i = 0; i < jumlahUnik; i++) {
            System.out.print(unik[i] + " ");
        }
        System.out.println("\nJumlah Peserta Unik: " + jumlahUnik);
    }
}
