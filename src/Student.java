public class Student {

    // initialise student attributes
    int age;
    double averageGrade;
    boolean isGoodAtMath;
    int year;
    String race;

    // student class constructor
    public Student(int inputAge,
                   double inputAvGrade,
                   boolean mathLevel,
                   int inputYear,
                   String inputRace) {
        this.age = inputAge;
        this.averageGrade = inputAvGrade;
        this.isGoodAtMath = mathLevel;
        this.year = inputYear;
        this.race = inputRace;
    }

    public void calculation(int firstNum, int secondNum) {
        if (this.isGoodAtMath == true) {
            System.out.println(firstNum + secondNum);
        }
        else {
            System.out.println("I'm not sure sir");
        }
    }

    public void complain() {
        System.out.println("Grrr I do not like that class");
    }

    public int graduate() {
        System.out.println("Oh boy I'm so happy I graduated");
        return this.year + 1;
    }
}


