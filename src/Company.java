import java.util.*;

class CompanyDetails {
    String companyName = "";
    String roleOffer = "";
    double packagePrice = 0;
    double cgCri = 0;
    List<StudentDetails> selectedStudent = new ArrayList<>();

    public void getSelectedStudent() {
        for (int i = 0; i < Student.allStudentList.size(); i++) {
            if (Student.allStudentList.get(i).cgpa >= cgCri) {
                selectedStudent.add(Student.allStudentList.get(i));
            }
        }

        System.out.println("List of Selected Student:");
        for (int i = 0; i < selectedStudent.size(); i++) {
            System.out.println(selectedStudent.get(i).name);
        }
    }
}

public class Company {
}
