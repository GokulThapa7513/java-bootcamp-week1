package org.example.projects.StudentManagementSystem;
import java.util.ArrayList;
public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }
    public void removeStudent(String studentId) {
        Student toRemove = null;
        for(Student s : students) {
            if(s.getStudentId().equals(studentId)) {
                toRemove = s;
                break;
            }
        }
        if(toRemove != null) {
            students.remove(toRemove);
            System.out.println("Student removed");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void searchByName(String name) {
        Student found = null;
        for(Student s : students) {
            if(s.getName().equalsIgnoreCase(name)) {
                found = s;
                break;
            }
        }
        if (found != null) {
            System.out.println(found);
        }else {
            System.out.println("No student found");
        }
    }

    public void searchById(String studentId) {
        Student found = null;
        for(Student s : students) {
            if(s.getStudentId().equals(studentId)) {
                found = s;
                break;
            }
        }
        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("No student found");
        }
    }

    public void viewAllStudents(){
        if(students.isEmpty()) {
            System.out.println("No Students enrolled");
        } else {
            for(Student s : students) {
                System.out.println(s);
            }
        }
    }

    public void updateGrade(String studentId, double newGrade) {
        boolean found = false;

        for(Student s : students) {
            if(s.getStudentId().equals(studentId)) {
                s.setGrade(newGrade);
                System.out.println("Grade updated");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found");
        }
    }

}
