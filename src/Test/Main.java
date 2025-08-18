package Test;

class Student {
   String name;
     int rollNum;
    double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNum = rollNum;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNum);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create two Student objects
        Student student1 = new Student("madhu", 101, 85.5);
        Student student2 = new Student("mohan", 102, 92.0);

        // Display details of both students
        student1.displayDetails();
        student2.displayDetails();
    }
}