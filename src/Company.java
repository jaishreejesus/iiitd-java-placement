import java.util.*;

class CompanyDetails {
    String companyName = "";
    String roleOffer = "";
    double packagePrice = 0;
    double cgCri = 0;
    List<StudentDetails> selectedStudent = new ArrayList<>();

    CompanyDetails(String companyName, String roleOffer, double packagePrice, double cgCri) {
        this.companyName = companyName;
        this.roleOffer = roleOffer;
        this.packagePrice = packagePrice;
        this.cgCri = cgCri;
    }

    CompanyDetails() {}

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
    static Scanner sc = new Scanner(System.in);
    static List<CompanyDetails> allCompanyList = new ArrayList<>();

    public void companyMenu() {
        System.out.println("Choose the company query to perform");
        String sampleCompanyText = "1) Add Company Details"+
                "\n2) Choose Company"+
                "\n3) Get Available Companies"+
                "\n4) Exit to main menu";

        while (true) {
            System.out.println(sampleCompanyText);
            int compChoice = sc.nextInt();

            if (compChoice == 1) {
                System.out.println("Enter Company Name");
                String companyName = sc.nextLine();
                System.out.println("Enter Role Offer");
                String roleOffer = sc.nextLine();
                System.out.println("Enter Package Price");
                double packagePrice = sc.nextDouble();
                System.out.println("Enter CGPA Criteria");
                double cgCri = sc.nextDouble();
                allCompanyList.add(new CompanyDetails(companyName, roleOffer, packagePrice, cgCri));
            } else if (compChoice == 2) {

            } else if (compChoice == 3) {
                System.out.println("List of Companies:");
                for (int i = 0; i < allCompanyList.size(); i++) {
                    System.out.println("Company Name: " + allCompanyList.get(i).companyName);
                }
            } else if (compChoice == 4) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
