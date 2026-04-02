package org.example.projects.StudentManagementSystem;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Select the options from 1 to 7");
            System.out.println("1. Add | 2. Remove | 3. Search by Name | 4. Search by ID |" +
                    " 5. View All Students | 6. Update Grade | 7. Exit");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter name: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();

                    System.out.println("Enter age: ");
                    scanner.nextLine();
                    int age = scanner.nextInt();

                    System.out.println("Enter Student ID: ");
                    scanner.nextLine();
                    String id = scanner.nextLine();

                    System.out.println("Enter subject: ");
                    String subject = scanner.nextLine();

                    System.out.print("Enter email (or press Enter to skip): ");
                    String email = scanner.nextLine();

                    System.out.print("Enter grade (or 0 if not yet): ");
                    double grade = scanner.nextDouble();

                    if (email.isEmpty()) {
                        sm.addStudent(new Student(name, age, subject, id));
                    }else {
                        sm.addStudent(new Student(name, age, subject, id, email, grade));
                    }
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Enter student id: ");
                    String removeId = scanner.nextLine();
                    sm.removeStudent(removeId);
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Enter name: ");
                    String searchName = scanner.nextLine();
                    sm.searchByName(searchName);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Enter student id: ");
                    String searchId = scanner.nextLine();
                    sm.searchById(searchId);
                    break;
                case 5:
                    sm.viewAllStudents();
                    break;
                case 6:
                    scanner.nextLine();
                    System.out.println("Enter student ID: ");
                    String gradeId = scanner.nextLine();

                    System.out.println("Enter new grade: ");
                    double newGrade = scanner.nextDouble();
                    sm.updateGrade(gradeId, newGrade);
                    break;
                case 7:
                    System.out.println("You have chosen to exit!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose between 1 and 7.");

            }
        } while (option != 7);
        scanner.close();

    }
}

