import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class StudentDetails {
    String name;
    String rollNo;
    double cgpa;
    String branch;

    String curentStatus = null;


    StudentDetails(String name, String rollNo, double cgpa, String branch) {
        this.name = name;
        this.rollNo = rollNo;
        this.cgpa = cgpa;
        this.branch = branch;
    }

    String getCurentStatus() {
        return curentStatus;
    }

}

public class Student {
    static Scanner sc = new Scanner(System.in);
    public static String returnDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return now.format(formatter);
    }

    public static void studentMenu() {
        System.out.println("Choose Student Query to perform");
        String studentText = "1) Enter as a Student(Student name, Student RollNo required)"+
                "\n2) Add Students"+
                "\n3) Back to Main Menu";
        while (true) {
            System.out.println(studentText);
            int studentChoice = sc.nextInt();
            if (studentChoice == 1) {

            } else if (studentChoice == 2) {

            } else if (studentChoice == 3) {
                break;
            } else {
                System.out.println("Invalid choice");
                continue;
            }
        }
    }
}
