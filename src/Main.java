import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static Student testStudent = new Student();

    public static void mainApplication() {
        while (true) {
            System.out.println("Choose the mode you wish to enter: ");
            System.out.println("1) Enter as Student Mode");
            System.out.println("2) Enter as Company Mode");
            System.out.println("3) Enter as Placement Cell Mode");
            System.out.println("4) Exit back to main menu)");

            int mainAppchoice = sc.nextInt();
            if (mainAppchoice == 1) {

            } else if (mainAppchoice == 2) {

            } else if (mainAppchoice == 3) {

            } else if (mainAppchoice == 4) {
                break;
            } else {
                System.out.println("Invalid choice");
                continue;
            }
        }


    }

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

