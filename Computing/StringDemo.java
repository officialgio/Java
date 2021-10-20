import java.util.Scanner;

// String Demo

public class StringDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String message1 = "Welcome to Java"; // declaration and assignment
        // next() reads a string up to the first space
        System.out.print("Enter a string: ");
        String message2 = input.next();
        System.out.println("The entered string is " + message2); //"printIn" it prints the string then it prints the message2
    }
}

/* Output */ 

// Enter a string: Welcome to Java
// The entered string is Welcome
