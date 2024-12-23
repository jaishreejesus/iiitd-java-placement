import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class StudentDetails {
    String name;
    String rollNo;
    double cgpa;
    String branch;

    String currentStatus = null;

    StudentDetails(String name, String rollNo, double cgpa, String branch) {
        this.name = name;
        this.rollNo = rollNo;
        this.cgpa = cgpa;
        this.branch = branch;
    }

    StudentDetails() {}

    protected String getCurentStatus() {
        return currentStatus;
    }

    void updateCGPA(double newCG) {
        this.cgpa = newCG;
    }

}

public class Student {
    static Scanner sc = new Scanner(System.in);
    StudentDetails testStudentDetails = new StudentDetails();
    static List<StudentDetails> allStudentList = new ArrayList<>();

    public static String returnDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return now.format(formatter);
    }

    public void studentMenu() {
        System.out.println("Choose Student Query to perform");
        String studentText = "1) Enter as a Student(Student name, Student RollNo required)"+
                "\n2) Add Students"+
                "\n3) Display all students"+
                "\n4) Exit to main menu";

        while (true) {
            System.out.println(studentText);
            int studentChoice = sc.nextInt();
            if (studentChoice == 1) {
                System.out.println("Enter Student Name");
                String name = sc.next();
                System.out.println("Enter Student RollNo");
                String rollNo = sc.next();

                for (int i = 0; i < allStudentList.size(); i++) {
                    if (allStudentList.get(i).name.equals(name) && allStudentList.get(i).rollNo.equals(rollNo)) {
                        System.out.println("Student Details: ");
                        System.out.println("Name: " + allStudentList.get(i).name);
                        System.out.println("RollNo: " + allStudentList.get(i).rollNo);
                        System.out.println("CGPA: " + allStudentList.get(i).cgpa);
                        System.out.println("Branch: " + allStudentList.get(i).branch);
                        System.out.println("Current Status: " + allStudentList.get(i).getCurentStatus());
                        break;
                    }
                }

            } else if (studentChoice == 2) {

                System.out.println("How many students do you want to add?");
                int numStudents = sc.nextInt();
                String name = "", rollNo = "", branch = "";
                double cgpa = 0;
                for (int i = 0; i < numStudents; i++) {
                    System.out.println("Enter Name of Student " + (i + 1));
                    name = sc.next();
                    System.out.println("Enter RollNo of Student " + (i + 1));
                    rollNo = sc.next();
                    System.out.println("Enter CGPA of Student " + (i + 1));
                    cgpa = sc.nextDouble();
                    System.out.println("Enter Branch of Student " + (i + 1));
                    branch = sc.next();
                    allStudentList.add(new StudentDetails(name, rollNo, cgpa, branch));
                }

            } else if (studentChoice == 3) {

                for (int i = 0; i < allStudentList.size(); i++) {
                    System.out.println("Student Details: ");
                    System.out.println("Name: " + allStudentList.get(i).name);
                    System.out.println("RollNo: " + allStudentList.get(i).rollNo);
                    System.out.println("CGPA: " + allStudentList.get(i).cgpa);
                    System.out.println("Branch: " + allStudentList.get(i).branch);
                    System.out.println("Current Status: " + allStudentList.get(i).getCurentStatus());
                }
            } else if (studentChoice == 4) {
                System.out.println("Enter the RollNo of the student to update CGPA: ");
                double newCG = sc.nextDouble();
                String rollNo = sc.next();
                for (int i = 0; i < allStudentList.size(); i++) {
                    if (allStudentList.get(i).rollNo.equals(rollNo)) {
                        allStudentList.get(i).updateCGPA(newCG);
                        break;
                    }
                }
            } else if (studentChoice == 5) {
                break;
            }else {
                System.out.println("Invalid choice");
            }
        }
    }
}
