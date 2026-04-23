//Project 
//Student management system using linked list
import java.util.Scanner;
class Student {
    int id;
    String name;
    double marks;
    Student next;
    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.next = null;
    }
}
class StudentManagement {
    Student head = null;
    public void addStudent(int id, String name, double marks) {
        Student newStudent = new Student(id, name, marks);

        if (head == null) {
            head = newStudent;
        } else {
            Student temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newStudent;
        }
        System.out.println("Student added successfully!");
    }
    public void displayStudents() {
        if (head == null) {
            System.out.println("No records found.");
            return;
        }

        Student temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.id + ", Name: " + temp.name + ", Marks: " + temp.marks);
            temp = temp.next;
        }
    }
    public void searchStudent(int id) {
        Student temp = head;
        while (temp != null) {
            if (temp.id == id) {
                System.out.println("Student Found!");
                System.out.println("ID: " + temp.id + ", Name: " + temp.name + ", Marks: " + temp.marks);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }
    public void deleteStudent(int id) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.id == id) {
            head = head.next;
            System.out.println("Student deleted successfully!");
            return;
        }

        Student temp = head;
        while (temp.next != null && temp.next.id != id) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student deleted successfully!");
        }
    }
}
public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagement sm = new StudentManagement();

        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    sm.addStudent(id, name, marks);
                    break;

                case 2:
                    sm.displayStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();
                    sm.searchStudent(searchId);
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();
                    sm.deleteStudent(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        sc.close();
    }
}