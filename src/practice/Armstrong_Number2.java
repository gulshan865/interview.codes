package practice;

import java.util.Scanner;

public class Armstrong_Number2 {

    public static void main(String[] args) {
        int a, x=0,y,b;
        System.out.println("Enter Any Number To Check");
        Scanner q = new Scanner(System.in);
        a = q.nextInt();
        b = a;

        while(a>0) {
            y = a % 10;
            x = (y * y * y) + x;
            a = a / 10;
        }
            if (b == x)
                System.out.print("Armstrong Number");
            else
                System.out.print("Not Armstrong Number");
        }
    }

