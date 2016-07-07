
public class Task8 {
    static  int counter = 0;

    public static int fib(int i) {
        if (i == 1) return 1;
        if (i == 2) return 1;
        if (i==4) counter++;
        return fib(i - 1) + fib(i - 2);
    }


    public static void main(String[] args) {

        System.out.println("15 элемент последоватеньности Фибоначчи " + fib(15));
        System.out.println("для вычисления 15го элемента ряда 4й элемент будет высчитан " + counter+" раз");
    }
}