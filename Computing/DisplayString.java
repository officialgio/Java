// String Demo

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {

        // Reading a string
        Scanner input = new Scanner(System.in);

    // next() reads a string ending with a whitespace
        System.out.print("Enter two strings separated by space: ");
        String s1 = input.next();
        String s2 = input.next();
        System.out.println("s1 is " + s1 + " & s2 is " + s2);
    // To read an entire line, use nextLine()
        System.out.print("Enter a line: ");
        String s3 = input.nextLine();
        System.out.println("s3 is " + s3);
    }
}


/* Output */ 

/* Enter two strings separated by space: Hello World

s1 is Hello & s2 is World
Enter a line: Welcome to Java
s3 is Welcome to Java

/*
