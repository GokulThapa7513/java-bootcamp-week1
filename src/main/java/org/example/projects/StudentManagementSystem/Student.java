package org.example.projects.StudentManagementSystem;

public class Student extends Person {
    private String studentId;
    private double grade;
    private String subject;
    private String email;

    public Student(String name , int age , String subject, String studentId) {
       this(name, age, subject, studentId,  "Not Provided", 0.0);
    }
    public Student(String name, int age, String subject, String studentId, String email, double grade) {
        super(name, age);
        this.grade = grade;
        this.studentId = studentId;
        this.subject = subject;
        this.email = email;

    }
    public void setGrade(double grade) {
        if(grade < 0.0 || grade > 100.0) {
            System.out.println("Invalid Grade!");
        }else {
            this.grade = grade;
        }
    }
    public double getGrade() {
        return grade;
    }
    public void setEmail(String email) {
        if(email == null || email.isEmpty()) {
            System.out.println("Please fill the field!");
        }else {
            this.email = email;
        }
    }
    public String getEmail() {
        return email;
    }
    public void setSubject(String subject) {
        if (subject == null || subject.isEmpty()) {
            System.out.println("Subject cannot be empty.");
        } else {
            this.subject = subject;
        }
    }
    public String getSubject() {
        return subject;
    }
    public String getStudentId() {
        return studentId;
    }



    @Override
    public String getRole() {
        return "Student";
    }
    @Override
    public String toString() {
        return "[" + getRole() + "]" + "Name = " + getName() + " | Age = " +  getAge() + " | ID = " + studentId + " | Subject = " + subject + " | Grade = " + grade + " | Email = " + email;
    }
}
