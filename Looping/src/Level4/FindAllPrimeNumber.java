package Level4;

public class FindAllPrimeNumber {
    public static void main(String[] args) {
        int N = 20;
        System.out.print("Output: ");

        for (int i = 2; i <= N; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
