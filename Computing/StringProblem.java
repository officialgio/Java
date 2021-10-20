
// Return the string as "I'm (Name) nice to meet you !" 

/* Problem Output */
// I'm GiovannyI'm HernandezI'm !

/* Old Code */  

// String Demo

public class StringDemo {
    public static void main(String[] args) {

        String message = "I'm"; // create string



        int mLength = message.length(); // 15 (returns length of the string
//        char ch = message.charAt(10); //charAt returns an specified index of a string

        String s1 = message.concat(" Giovanny");
        String s2 = message.concat(" Hernandez");
        String s3 = message.concat(" !");

        System.out.println(s1 + s2 + s3);


    }
}


/* new code */

// String Demo

public class StringDemo {
    public static void main(String[] args) {

        String message = "I'm"; // create string



        // int mLength = message.length(); // 15 (returns length of the string
//        char ch = message.charAt(10); //charAt returns an specified index of a string

        message = message.concat(" Giovanny").concat(" Hernandez").concat(" Nice").concat(" to").concat(" meet").concat(" you").concat(" ! "); // make sure to add spcaes

        System.out.println(message);


    }
}


/* Output */

// I'm Giovanny Hernandez Nice to meet you !



/* Excersize */


public class StringDemo {
    public static void main(String[] args) {

        String message = "Welcome to Java";
        String s1 = message.concat(" Programming");

        // concatenation using the + operator

        // s2 = Welcome to Java Programming
        String s2 = message + " Programming";

        // message = Welcome to Java Programming
        message += " Programming"; // add "Programming"
        message = " version "; // add "verson"
        message += 1 + 2; // message = version 3 (add version 3)
        // message = version 12
        message = message + 1 + 2; // add "12"

        System.out.print(s1 + message);
    }
}


/* Output */

// 'Welcome to Java Programming version 312"















