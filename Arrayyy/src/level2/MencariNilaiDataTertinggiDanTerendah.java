package level2;

public class MencariNilaiDataTertinggiDanTerendah {
    public static void main(String[] args) {
        int suhu[] = {29, 32, 27, 35, 31, 26, 34};
        int suhuTertinggi = suhu[0];
        int suhuTerendah = suhu[0];

        for (int i = 0; i < suhu.length; i++) {
            if (suhu[i] > suhuTertinggi) {
                suhuTertinggi = suhu[i];
            } 
            if (suhu[i] < suhuTerendah) {
                suhuTerendah = suhu[i];

            }
        }

        for  (int a = 0; a < suhu.length; a++) {
                System.out.println("indeks suhu ke-" + (a + 1) +" ialah: "+ suhu[a] + "°" );
        }
            int selisih = suhuTertinggi - suhuTerendah;
            System.out.println("Suhu tertinggi ialah: " + suhuTertinggi + "°");
            System.out.println("Suhu terendah ialah: " + suhuTerendah + "°");
            System.out.println("Selisih Suhu tertinggi dan terendah ialah: " + selisih + "°");
    }
}
