/**
 * Author = Aniruddh Abhisheki
 * Roll No = 07
 * Start Date = 23/10/24
 * Modified Date = 23/10/24
 * Description =  This program demonstrates how to handle exceptions in Java, specifically focusing on user input and error handling when converting a string to an integer.
 */

import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("You entered: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } finally {
            System.out.println("Execution finished.");
            scanner.close();
        }
    }
}
