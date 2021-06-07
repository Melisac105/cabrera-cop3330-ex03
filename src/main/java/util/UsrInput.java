package util;

import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);

    static public String readQuote() {
        System.out.print("What is the quote? ");
        return input.nextLine();
    }

    static public String readAuthor() {
        System.out.print("Who said it? ");
        return input.nextLine();
    }

}
