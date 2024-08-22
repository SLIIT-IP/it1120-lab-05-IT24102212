import java.util.Scanner;

public class IT24102212Lab5Q1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three different integers
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = input.nextInt();

        // Initialize variables to store the smallest and largest numbers
        int smallest, largest;

        // Find the smallest number
        smallest = (num1 < num2) ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);

        // Find the largest number
        largest = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);

        // Output the smallest and largest numbers
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);

        // Close the Scanner object
        input.close();
    }
}
