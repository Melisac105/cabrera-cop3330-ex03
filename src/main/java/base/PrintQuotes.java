/*
UCF COP3330 Summer 2021 Assignment 1 Solution
Copyright 2021 Melissa Cabrera

Exercise 3 - Printing Quotes
Quotation marks are often used to denote the start and end of a string. But sometimes we need to print out the quotation marks themselves by using escape characters.

Create a program that prompts for a quote and an author. Display the quotation and author as shown in the example output.

Example Output

What is the quote? These aren't the droids you're looking for.
Who said it? Obi-Wan Kenobi
Obi-Wan Kenobi says, "These aren't the droids you're looking for."

Constraints

Use a single output statement to produce this output, using appropriate string-escaping techniques for quotes.
If your language supports string interpolation or string substitution, don’t use it for this exercise. Use string concatenation instead.

Challenge

Modify this program so that instead of prompting for quotes from the user, you create a structure that holds quotes and their associated attributions and then display all of the quotes using the format in the example. An array of maps would be a good choice.
 */

package base;

import java.util.Scanner;

public class PrintQuotes {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        PrintQuotes myQuote = new PrintQuotes();

        String quoteString = myQuote.quote();
        String quoteAuthor = myQuote.author();
        myQuote.output(quoteString,quoteAuthor);
    }

    public String quote() {
        System.out.print("What is the quote? ");
        return input.nextLine();
    }
    public String author() {
        System.out.print("Who said it? ");
        return input.nextLine();
    }

    public void output(String quotation, String authorName) {
        System.out.println(authorName + " says, " + "\"" + quotation + "\"");
    }
}
