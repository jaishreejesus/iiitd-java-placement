import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
    public static String returnDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return now.format(formatter);
    }



}
