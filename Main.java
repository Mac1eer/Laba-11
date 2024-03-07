
public class Main {
    public static void main(String[] args) {
        Student John = new Student(20, "John Doe", "123456789", 2, "Engineering", 2019);
        Student Alice = new Student(22, "Alice Smith", "987654321", 3, "Medicine", 2018);
        Student Bob = new Student(21, "Bob Johnson", "555555555", 1, "Psychology", 2020);
        Student [] students  = {John, Alice, Bob};
        System.out.println("ФИО и возраст всех студентов:");
        for (Student student : students) {
            System.out.println("ФИО: " + student.fullName + " Возраст: " + student.getAge());
        }
        String faculty = "Engineering";
        System.out.println("Студенты факультета " + faculty + ":");
        for (Student student : students) {
            if (student.faculty.equals(faculty)) {
                System.out.println("ФИО: " + student.fullName + " Возраст: " + student.getAge());
            }
        }
        System.out.println("Студенты, поступившие после " + 2019 + " года:");
        for (Student student : students) {
            if (student.getAdmissionYear() > 2019) {
                System.out.println("ФИО: " + student.fullName + " Возраст: " + student.getAge());
            }
        }
    }
}
class Person {
    private int age;
    public String fullName;
    public String phoneNumber;

    public Person(int age, String fullName, String phoneNumber) {
        this.age = age;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }
}

class Student extends Person {
    public int course;
    public String faculty;
    private int admissionYear;

    public Student(int age, String fullName, String phoneNumber, int course, String faculty, int admissionYear) {
        super(age, fullName, phoneNumber);
        this.course = course;
        this.faculty = faculty;
        this.admissionYear = admissionYear;
    }

    public int getAdmissionYear() {
        return admissionYear;
    }
}