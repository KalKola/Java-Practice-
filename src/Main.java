public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Kal");

        Student Kal = new Student(21, 85.1, true, 4, "Irish");
        Student BadKal = new Student(21, 41, false, 4, "Indian");

        Kal.calculation(11, 21);
        BadKal.calculation(2, 2);

        Kal.complain();

        Kal.year = Kal.graduate();
        System.out.println(Kal.year);


    }
}