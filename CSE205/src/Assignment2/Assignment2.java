//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;

public class Assignment2 {
    public Assignment2() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 1;
        int min = 999999999;
        int minEven = 0;
        int count = 0;
        int sum = 0;

        while(input != 0) {
            input = scan.nextInt();
            if (input < min) {
                min = input;
            }

            if (input % 2 == 0 && input < minEven) {
                minEven = input;
            }

            if (input < 0) {
                ++count;
            }

            if (input % 2 != 0) {
                sum += input;
            }
        }

        System.out.print("The minimum integer is " + min + "\n" + "The smallest even integer in the sequence is " + minEven + "\n" + "The count of negative integers in the sequence is " + count + "\n" + "The sum of odd integers is " + sum + "\n");
        scan.close();
    }
}