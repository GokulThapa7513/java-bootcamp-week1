package org.example.projects.StudentManagementSystem;

public abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            System.out.println("Do not leave the field empty. Enter the name. ");
        }else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }
    public void setAge(int age) {
        if(age<0 || age > 150) {
            System.out.println("Please enter the valid age between 0 and 150.");
        }else {
            this.age = age;
        }
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name = " + getName() + " Age = " + getAge() ;
    }

    public abstract String getRole();

}
