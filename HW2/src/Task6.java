
public class Task6 {

    public static void main(String[] args) {
        int[][] mass = new int[7][4];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                mass[i][j] = (-5) + (int) (Math.random() * ((5 - (-5)) + 1));
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int[] couterOfstringsCompilations = {1, 1, 1, 1, 1, 1, 1};


        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                couterOfstringsCompilations[i] *= Math.abs(mass[i][j]);
            }
            System.out.print(Math.abs(couterOfstringsCompilations[i]) + " ");
        }
        System.out.println();
        int maxValueofcounterArray = 0;
        int maxValueofcounterArrayIndex = 0;
        for (int i = 0; i < couterOfstringsCompilations.length; i++) {
            if (couterOfstringsCompilations[i] > maxValueofcounterArray) {
                maxValueofcounterArray = couterOfstringsCompilations[i];
                maxValueofcounterArrayIndex = i;

            }
        }
        System.out.println(maxValueofcounterArrayIndex + " \nСчет начинаеться с нуля, произведение членов указанны выше");
    }
}
