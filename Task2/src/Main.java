public class Main {
    public static void main(String[] args) {
        System.out.println("Мы сейчас посчитаем 11 первых членов последовательности Фибеначчи");
        int[] fibonachiList = new int[11];
        fibonachiList[0] = 1;
        fibonachiList[1] = 1;
        int summFibonachiList = 2;
        for (int i = 2; i < 11; i++) {
            fibonachiList[i] = fibonachiList[i - 1] + fibonachiList[i - 2];
            System.out.println(fibonachiList[i]);
        }
    }
}
