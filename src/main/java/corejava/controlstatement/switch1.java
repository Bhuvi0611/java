package corejava.controlstatement;

import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("tell us your fav laptop brand name");
        String brand=scan.nextLine();
        switch(brand)
        {
            case "HP":
                System.out.println("your fav is HP");
                break;
            case "lenovo":
                System.out.println("your fav is lenovo");
                break;
            case "acer":
                System.out.println("your fav is acer");
                break;
            default:
                System.out.println("your fav is not matching");
        }
    }

}
