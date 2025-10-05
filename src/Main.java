import records.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        //Record
        Student person = new Student("Vitor", 27);
        System.out.println(person.toString());
    }
}