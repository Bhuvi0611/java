package corejava.controlstatement;

import java.util.Scanner;

public class Nestedif {
    public static void main(String[] args) {
        Scanner scans = new Scanner(System.in);
        System.out.println("please tell us your maths mark");
        int mathsmark = scans.nextInt();

        if (mathsmark >= 50) {
            System.out.println("YOUR ARE SELECTED ENGINEER CATAGORY");
            Scanner scan = new Scanner(System.in);
            System.out.println("please tell us your biology mark");
            int biologymark = scans.nextInt();
            if (mathsmark >= 50 && biologymark >= 75) {
                System.out.println("YOUR ARE SELECTED IN MEDICAL FIELD AND BE CATEGORY");
                System.out.println("GOOD LUCK");
            } else {
                System.out.println("your not eligible for medical field(only selected BE category");
            }
        }
        else{
            System.out.println("your not eligible for engineer and medical field");
        }
    }


}
