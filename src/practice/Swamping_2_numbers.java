package practice;

import java.util.Scanner;

public class Swamping_2_numbers {

    public static void main(String[] args) {
        int a,b;
        System.out.print("Enter Any Two Numbers");
        Scanner no = new Scanner(System.in);
        a= no.nextInt();
        b= no.nextInt();
        System.out.println("Before Swaping " +a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swaping " +a+" "+b);

    }
}
