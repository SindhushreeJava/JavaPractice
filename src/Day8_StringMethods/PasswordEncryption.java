package Day8_StringMethods;
//You are building a basic password encryption feature for a login system in a mobile app.
// For demonstration purposes, the system simply reverses the entered password before
// storing it, simulating a basic encoding method

import java.util.Scanner;

public class PasswordEncryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // the user to enter a password
        System.out.print("Enter your password: ");
        String OPWD = sc.nextLine();

        //  Encrypt the password by reversing it
        String encryptedPWD= reverseString(OPWD);

        // Show the encrypted password (for demo only)
        System.out.println("Encrypted password (stored): " + encryptedPWD);

        sc.close();
    }

    // Method to reverse a string
    public static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;

    }
}
