package org.launchcode;
import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        Integer length = input.nextInt();
        System.out.println("What is the height of the rectangle?");
        Integer height = input.nextInt();
        Integer result = length * height;
        System.out.println("The area of the rectangle is " + result);
        input.close();
    }
}
