package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher manny = new Teacher(2, "Manny", 700);
        Teacher john = new Teacher(3, "John", 600);

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(lizzy);
        teachers.add(manny);
        teachers.add(john);

        Student james = new Student(1, "James", 4);
        Student maria = new Student(2, "Maria", 9);
        Student felix = new Student(3, "Felix", 2);

        List<Student> students = new ArrayList<>();
        students.add(james);
        students.add(felix);
        students.add(maria);

        System.out.println("----------- New School -----------");
        School school = new School(teachers, students);
        System.out.println("Total school balance: " + school.getBalance());

        System.out.println("----------- Students Pay Fees -----------");
        james.payFees(1000, school);
        maria.payFees(1000, school);
        felix.payFees(1000, school);

        System.out.println("Total school balance: " + school.getBalance());

        System.out.println("----------- School Pays Salaries -----------");
        school.paySalary(lizzy);
        school.paySalary(manny);
        school.paySalary(john);

        System.out.println("Total school balance: " + school.getBalance());
    }
}
