package Level3;

public class RectangleStarPattern {
    public static void main(String[] args) {
        int R = 3;
        int C = 5;

        for (int i = 1; i <= R; i++) {
            for(int j = 1; j <= C; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
