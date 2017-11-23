package userinput;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("Please enter the following information.");
        System.out.println(" ");
        System.out.print("First Name: ");
        Scanner input = new Scanner(System.in);
        String firstName = input.next();
        System.out.print("Last Name: ");
        String lastName = input.next();
        System.out.print("Grade: ");
        String year = input.next();
        System.out.print("Login name: ");
        String login = input.next();
        System.out.print("Predicted grade: ");
        String grade = input.next();
        
        System.out.println(" ");
        System.out.println("Your information: ");
        System.out.println("    Login: " + login);
        System.out.println("    Name: " + lastName + ", " + firstName);
        System.out.println("    Grade: " + year);
        System.out.println("    Predicted grade: " + grade);
    }
}
