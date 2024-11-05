package level3.exercise1;

class Student {
    private String name;
    private int age;
    private String grade;
    private int calification;

    public Student(String name, int age, String grade, int calification) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.calification = calification;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    public int getCalification() {
        return calification;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", grade='" + grade + "', calification=" + calification + '}';
    }
}