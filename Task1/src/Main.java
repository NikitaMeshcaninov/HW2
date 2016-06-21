import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        int Summ = 0;
        char[] numberArray = new char[number.length()];
        for (int i = 0; i < number.length(); i++) {
            Summ += number.charAt(i) - 48;
        }
        System.out.println("Сумма чисел вашего числа составляет = " + Summ);
    }
}
