// Assignment #: 1
// Arizona State University - CSE205
//         Name: Katelyn Landaal
//    StudentID: 1213318819
//      Lecture: M W F 8:35 AM to 9:25 AM
//  Description: This class reads an integer from a keyboard and prints it out
//               along with other messages.

import java.util.Scanner;  // use the Scanner class located in the "java.util" directory

public class Assignment1
{
    public static void main (String[] args)
    {
        int number;

        Scanner console = new Scanner(System.in);

        number = console.nextInt();     // read an integer entered by a user

        // display the number with other messages
        System.out.print("This program reads an integer from a keyboard,\n"
                + "and prints it out on the display screen.\n"
                + "Make sure that you get the exact same output as the expected one.\n"
                + "The read number is " + number + ".\n");
    }
}