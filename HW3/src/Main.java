

public class Main {

    public static void main(String[] args) {

        Person CBob = new Person("Bob", 27, "M");
        Student LBrooke = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        Teacher DJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000.0);
        CollageStudent IFrosh = new CollageStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        String[] person = {CBob.toString(), LBrooke.toString(), DJava.toString(), IFrosh.toString()};
        System.out.println(person[0]+ "\n"+person[1]+ "\n"+person[2]+ "\n"+person[3]);
    }
}
