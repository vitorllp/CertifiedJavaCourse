package records;

public record Student(String name, int age){
    public Student {
        if (age < 18) throw new IllegalArgumentException("Student is not allowed");
    }
}
