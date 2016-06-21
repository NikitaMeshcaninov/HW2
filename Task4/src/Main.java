public class Main {

    public static void main(String[] args) {
        int[] clock = {0, 0, 0, 0};
        int counter = 0;
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                if (i < 10) {
                    clock[0] = 0;
                    clock[1] = i;
                } else {
                    String str = Integer.toString(i);
                    clock[0] = Character.getNumericValue(str.charAt(0));
                    clock[1] = Character.getNumericValue(str.charAt(1));
                }
                if (j < 10) {
                    clock[2] = 0;
                    clock[3] = j;
                } else {
                    String str = Integer.toString(j);
                    clock[2] = Character.getNumericValue(str.charAt(0));
                    clock[3] = Character.getNumericValue(str.charAt(1));
                }
                System.out.print(clock[0]);                                        //For debug
                System.out.print(clock[1] + ":");
                System.out.print(clock[2]);
                System.out.println(clock[3]);
                if (clock[0] == clock[3] && clock[1] == clock[2]) {
                    counter++;
                    System.out.println("!!!!!!!!!!!!!^^^!!!!!!!!!!!!!!");           //For debug
                }
            }
        }
        System.out.println("зеркальных комбинаций " + counter);
    }
}
