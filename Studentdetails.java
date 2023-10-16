import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Studentdetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<RecordsStudents> students = new ArrayList<>();
        boolean exit = false;

        do {
            System.out.println("""
                    \nStudent Record Management System
                    1. Add Student
                    2. View Student Records
                    3. Update Student Grade
                    4. Exit
                    Enter your choice:
                        """);

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add Student
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Grade can be A,B,C,E,F \nEnter student grade: ");
                    String grade = scanner.next();
                    students.add(new RecordsStudents(id, name, grade));
                    break;

                case 2:
                    // View Student Records
                    System.out.println("Student Records:");
                    for (RecordsStudents student : students) {
                        System.out.println(student);
                    }
                    break;

                case 3:
                    // Update Student Grade
                    System.out.print("Enter student ID to update grade: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter new grade: ");
                    String newGrade = scanner.next();

                    for (RecordsStudents student : students) {
                        if (student.getId() == updateId) {
                            student.setGrade(newGrade);
                            System.out.println("Grade updated successfully.");
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (!exit);

        scanner.close();
    }
}

class RecordsStudents {
    private int id;
    private String name;
    private String grade;

    public RecordsStudents(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "ID: " + id + ",\n Name: " + name + ",\n Grade: " + grade;
    }
}