package exercises.playground;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String args[])
    {
        int x, y;

        System.out.println("Enter two integers to calculate their sum");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first integer");
        x = in.nextInt();
        System.out.println("Enter the second integer");
        y = in.nextInt();


        System.out.println("Sum of the integers = " + add(x,y));
    }

    public static int add(int a, int b){
        return a+b;
    }

}
