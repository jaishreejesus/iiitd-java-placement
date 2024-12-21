import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void mainApplication() {


    }

    public static void main(String[] args) {
        System.out.println("Welcome to FutureBuilder: ");
        System.out.println("1: Enter the application");
        System.out.println("2. Exit the application");
        int first_choice = sc.nextInt();
        if(first_choice == 1) {
            mainApplication();
        } else if (first_choice == 2) {
            System.out.println("Thank you for using FutureBuilder");
            System.exit(0);
        }
    }
}

