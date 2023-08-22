package org.launchcode;
import java.util.Scanner;
public class Gas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles did you drive?");
        Integer miles = input.nextInt();
        System.out.println("How much gas did you use in gallons?");
        Integer gas = input.nextInt();
        Integer mpg = miles / gas;
        System.out.println("Your miles-per-gallon is " + mpg);
        input.close();
    }
}
