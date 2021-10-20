
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
