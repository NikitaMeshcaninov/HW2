import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите N");
        Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();
        int userNumber1 = userNumber;
        ArrayList<Integer> ListOfOurNumbers = new ArrayList<Integer>();
        for (int i = 2; i < userNumber; i++) {
            ListOfOurNumbers.add(i);
            System.out.println(ListOfOurNumbers.toString());
        }
        ArrayList<Integer> DesolyatorList = new ArrayList<Integer>();
        DesolyatorList = ListOfOurNumbers;                               //Список возможных делителей
        System.out.println(ListOfOurNumbers.toString());


        for (int i = 0; i < (userNumber - 2); i++) {
           
            for (int j = 0; j < userNumber - 2; j++) {
                if (ListOfOurNumbers.get(i) % DesolyatorList.get(j) == 0 && ListOfOurNumbers.get(i) != DesolyatorList.get(j)) {
                    ListOfOurNumbers.remove(i);
                    userNumber--;
                    i--;
                    break;
                }
            }
        }
        System.out.println(ListOfOurNumbers.toString());
    }
}
