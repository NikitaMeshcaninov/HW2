public class Main {
    public static void main(String[] args) {
        System.out.println("Считаем количество счастливых билетиков " +
                "от номера 000001 до 999999 ");
        int[] ticketNumber = {0, 0, 0, 0, 0, 0};
        int Summ1 = 0; // Переменная для суммы 3х первых цифр
        int Summ2 = 0; // Переменная для суммы 3х оставшихся цифр
        int Result = 0; // Счетчик счастливых билетов
        for (int i = 0; i < 1000; i++) { // Цикл для перебора всех комбинаций разбитый на 2 цикла, т.е. по всему ряду программа проходит 1н раз
            for (int j = 1; j < 1000; j++) {
                ticketNumber[0] = 0; // обнулятель номера билета (целый час думал почему количество билетов не совпадает с правильным)
                ticketNumber[1] = 0; // необходимо для того чтобы не заполнять нулями пренудительно пустые числа в билете
                ticketNumber[2] = 0;
                ticketNumber[3] = 0;
                ticketNumber[4] = 0;
                ticketNumber[5] = 0;
                if (i < 10) {                // Два раветвления по i и j  заполнение с правва налево 2х блоков масива, каждый
                    ticketNumber[2] = i;     // по 3 числа
                } else if (i < 100) {
                    String str = Integer.toString(i);
                    ticketNumber[1] = Character.getNumericValue(str.charAt(0));
                    ticketNumber[2] = Character.getNumericValue(str.charAt(1));
                } else if (i < 1000 && i >= 100) {
                    String str = Integer.toString(i);
                    ticketNumber[0] = Character.getNumericValue(str.charAt(0));
                    ticketNumber[1] = Character.getNumericValue(str.charAt(1));
                    ticketNumber[2] = Character.getNumericValue(str.charAt(2));
                }
                if (j < 10) {
                    ticketNumber[5] = j;
                } else if (j < 100) {
                    String str = Integer.toString(j);
                    ticketNumber[4] = Character.getNumericValue(str.charAt(0));
                    ticketNumber[5] = Character.getNumericValue(str.charAt(1));
                } else if (j < 1000) {
                    String str = Integer.toString(j);
                    ticketNumber[3] = Character.getNumericValue(str.charAt(0));
                    ticketNumber[4] = Character.getNumericValue(str.charAt(1));
                    ticketNumber[5] = Character.getNumericValue(str.charAt(2));
                }

                Summ1 = ticketNumber[0] + ticketNumber[1] + ticketNumber[2];  // подсчет сумм
                Summ2 = ticketNumber[3] + ticketNumber[4] + ticketNumber[5];
                if (Summ1 == Summ2) {
                    Result++;
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");     // вместо дибага для разбора ошибок
                }
                System.out.print(ticketNumber[0]);
                System.out.print(ticketNumber[1]);
                System.out.print(ticketNumber[2]);
                System.out.print(ticketNumber[3]);
                System.out.print(ticketNumber[4]);
                System.out.println(ticketNumber[5]);
            }
        }
        System.out.println(Result);
    }
}
