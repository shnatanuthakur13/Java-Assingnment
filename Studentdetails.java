import java.util.ArrayList;
import java.util.Scanner;

public class StudentRecordManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentRecords records = new StudentRecords();

        // Sample data - Add students
        Student student1 = new Student("John Doe", 101, new double[]{95, 87, 92});
        Student student2 = new Student("Jane Smith", 102, new double[]{88, 76, 90});
        records.addStudent(student1);
        records.addStudent(student2);

        while (true) {
            System.out.println("Options:");
            System.out.println("1. Display all students");
            System.out.println("2. Display student information by ID");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    records.displayAllStudents();
                    break;
                case 2:
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    records.displayStudentInformation(id);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class StudentRecords {
    private ArrayList<Student> students;

    public StudentRecords() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudentInformation(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Name: " + student.getName());
                System.out.println("ID: " + student.getId());
                System.out.println("Grades: " + arrayToString(student.getGrades()));
                System.out.println("Average Grade: " + student.calculateAverageGrade());
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("ID: " + student.getId());
            System.out.println("Grades: " + arrayToString(student.getGrades()));
            System.out.println("Average Grade: " + student.calculateAverageGrade());
            System.out.println();
        }
    }

    private String arrayToString(double[] array) {
        StringBuilder sb = new StringBuilder();
        for (double value : array) {
            sb.append(value).append(" ");
        }
        return sb.toString().trim();
    }
}

