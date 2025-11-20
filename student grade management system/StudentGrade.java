import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int m1, m2, m3;
    double average;
    String grade;

    Student(String name, int m1, int m2, int m3) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        calculateAverage();
        calculateGrade();
    }

    void calculateAverage() {
        this.average = (m1 + m2 + m3) / 3.0;
    }

    void calculateGrade() {
        if (average >= 90) grade = "A+";
        else if (average >= 80) grade = "A";
        else if (average >= 70) grade = "B";
        else if (average >= 60) grade = "C";
        else grade = "D";
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("-----------------------------");
    }
}

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter name: ");
                    sc.nextLine(); // clear buffer
                    String name = sc.nextLine();

                    System.out.print("Enter mark 1: ");
                    int m1 = sc.nextInt();
                    System.out.print("Enter mark 2: ");
                    int m2 = sc.nextInt();
                    System.out.print("Enter mark 3: ");
                    int m3 = sc.nextInt();

                    list.add(new Student(name, m1, m2, m3));
                    System.out.println("Student added successfully!\n");
                    break;

                case 2:
                    if (list.isEmpty()) {
                        System.out.println("No records found.\n");
                    } else {
                        for (Student s : list) {
                            s.display();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.\n");
            }
        }
    }
}
