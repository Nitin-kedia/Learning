//  program to reverse an integer number

import java.util.*;

public class Task1_A {

     static int reversedNumber(int num){

       int  reversed = 0;
        while(num != 0) {


            int digit = num % 10;
            reversed = reversed * 10 + digit;


            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
        return 0;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Interger: ");
        int num = s.nextInt();
        System.out.println("Original Number: " + num);
        reversedNumber(num);
    }
}

