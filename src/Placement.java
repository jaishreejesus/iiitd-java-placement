import java.util.Scanner;

class PlacementDetails {
    boolean placementStatus = false;
    public void openPlacementRegistration() {
        this.placementStatus = true;
        String currentDateTime = Student.returnDateTime();
        System.out.print("Opening registration at: ");
        System.out.println(currentDateTime);
    }
}

public class Placement {
    static Scanner sc = new Scanner(System.in);

    public void placementMenu() {
        System.out.println("Welcome to IIITD Placement Cell");
        String samplePlacementText = "1) Open Student Registration"+
                "\n2) Open Company Registration"+
                "\n3) Get Number of Students Registered"+
                "\n4) Get Number of Company Registrations"+
                "\n5) Get Number of Offered/Unoffered/Blocked Students"+
                "\n6) Get Student Details"+
                "\n7) Get Company Details"+
                "\n8) Get Average Package"+
                "\n9) Get Company Process Results"+
                "\n10) Exit";

        PlacementDetails testPlacement = new PlacementDetails();

        while (true) {
            System.out.println(samplePlacementText);
            int placChoice = sc.nextInt();

            if (placChoice == 1) {
                testPlacement.openPlacementRegistration();
            }

        }

    }
}
