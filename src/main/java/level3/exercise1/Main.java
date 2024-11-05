package level3.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // List of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alicia", 20, "JAVA", 10));
        students.add(new Student("Alejandra", 19, "PHP", 4));
        students.add(new Student("María", 22, "JAVA", 7));
        students.add(new Student("Clara", 21, "PHP", 5));
        students.add(new Student("Fernanda", 23, "JAVA", 3));
        students.add(new Student("Iria", 18, "C#", 8));
        students.add(new Student("Eva", 17, "PHP", 6));
        students.add(new Student("Raquel", 24, "JAVA", 2));
        students.add(new Student("Ariadna", 20, "JAVA", 5));
        students.add(new Student("Ana", 17, "C++", 9));

        System.out.println("All Students:");
        students.forEach(student -> System.out.println("Name: " + student.getName() + ", Age: " + student.getAge()));


        System.out.println("\nStudents whose name starts with 'A':");
        List<Student> studentsStartingWithA = students.stream()
                .filter(student -> student.getName().startsWith("A"))
                .collect(Collectors.toList());
        studentsStartingWithA.forEach(student -> System.out.println(student));


        System.out.println("\nStudents with calification of 5 or higher:");
        students.stream()
                .filter(student -> student.getCalification() >= 5)
                .forEach(student -> System.out.println(student));


        System.out.println("\nStudents with calification of 5 or higher and not in PHP:");
        students.stream()
                .filter(student -> student.getCalification() >= 5 && !student.getGrade().equals("PHP"))
                .forEach(student -> System.out.println(student));


        System.out.println("\nStudents in JAVA and of legal age (18 or older):");
        students.stream()
                .filter(student -> student.getGrade().equals("JAVA") && student.getAge() >= 18)
                .forEach(student -> System.out.println(student));
    }
}
