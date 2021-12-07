package practice;

import java.util.Scanner;

public class Plindrome_Number {

    public static void main(String[] args) {
        int r; int sum = 0; int temp,x;

        System.out.println("Enter number");

        Scanner n = new Scanner(System.in);

        r = n.nextInt();

        temp=r;

        while (r>0){
            x=r%10;
            sum=(sum*10)+x;
            r=r/10;

        }
        if (temp==sum)
            System.out.println("Palindrome number");
        else
            System.out.println("Not Palindrome number");




    }
}
