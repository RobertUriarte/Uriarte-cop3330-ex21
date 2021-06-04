/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Robert Uriarte
 */
import java.util.Scanner;
public class Exercise21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number 1 through 12: ");
        int month = scan.nextInt();

        switch(month){
            case 1:
                System.out.printf("The name of the month is January");
                return;
            case 2:
                System.out.printf("The name of the month is February");
                return;
            case 3:
                System.out.printf("The name of the month is March");
                return;
            case 4:
                System.out.printf("The name of the month is April");
                return;
            case 5:
                System.out.printf("The name of the month is May");
                return;
            case 6:
                System.out.printf("The name of the month is June");
                return;
            case 7:
                System.out.printf("The name of the month is July");
                return;
            case 8:
                System.out.printf("The name of the month is August");
                return;
            case 9:
                System.out.printf("The name of the month is September");
                return;
            case 10:
                System.out.printf("The name of the month is October");
                return;
            case 11:
                System.out.printf("The name of the month is November");
                return;
            case 12:
                System.out.printf("The name of the month is December");
                return;
        }
    }

}