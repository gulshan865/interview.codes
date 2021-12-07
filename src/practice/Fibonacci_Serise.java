package practice;

import java.util.Scanner;

public class Fibonacci_Serise {
    public static void main(String[] args) {
        int term, a=0,b=1,c;
        System.out.println("Enter Term");
        Scanner m = new Scanner(System.in);
        term=m.nextInt();
        for (int i=1;i<=term;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
