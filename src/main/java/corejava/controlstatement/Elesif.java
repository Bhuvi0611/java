package corejava.controlstatement;

import java.util.Scanner;

public class Elesif {
    public static void main(String[] args) {
        Scanner ss= new Scanner(System.in);

        System.out.println("Enter the  cooling place");
        String place = ss.nextLine();
        String place1 = ss.nextLine();
        if (place1.equalsIgnoreCase("ooty")) {
            System.out.println("ooty");
        } else if (place1.equalsIgnoreCase("kodaikanal")) {
            System.out.println("kodaikanal");
        } else if ((place.equalsIgnoreCase("manali")) || (place1.equalsIgnoreCase("kashmir"))) {
            System.out.println("kashmir is cooling place");
        } else {
            System.out.println("mettur");
        }

}
}
