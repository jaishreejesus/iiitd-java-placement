import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Student testStudent = new Student();
    static Placement testPlacement = new Placement();
    static Company testCompany = new Company();

    public static void mainApplication() {
        while (true) {
            System.out.println("Choose the mode you wish to enter: ");
            System.out.println("1) Enter as Student Mode");
            System.out.println("2) Enter as Company Mode");
            System.out.println("3) Enter as Placement Cell Mode");
            System.out.println("4) Exit back to main menu)");

            int mainAppchoice = sc.nextInt();
            if (mainAppchoice == 1) {
                testStudent.studentMenu();
            } else if (mainAppchoice == 2) {
                testCompany.companyMenu();
            } else if (mainAppchoice == 3) {
                testPlacement.placementMenu();
            } else if (mainAppchoice == 4) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }



    // @Main Function that invokes the entrance to a program
    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to FutureBuilder: ");
            System.out.println("1: Enter the application");
            System.out.println("2. Exit the application");
            int first_choice = sc.nextInt();
            if (first_choice == 1) {
                mainApplication();
            } else if (first_choice == 2) {
                System.out.println("Thank you for using FutureBuilder");
                System.exit(0);
            }
        }
    }
}

