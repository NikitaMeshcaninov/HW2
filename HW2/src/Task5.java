
public class Task5 {

    public static void main(String[] args) {
        int[][] Mass = new int[8][5];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                Mass[i][j] = 10 + (int) (Math.random() * ((99 - 10) + 1));//
                System.out.print(Mass[i][j] + " ");
            }
            System.out.println();
        }
    }
}
