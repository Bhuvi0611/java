package corejava.controlstatement;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner ss= new Scanner(System.in);
        System.out.println("Enter the favname");
        String cname=ss.next();
        if(cname.equalsIgnoreCase("BHUVANA"))
        {
            System.out.println("you got your favname");
        }
        else{
            System.out.println("Not eligible");
        }
    }

}
