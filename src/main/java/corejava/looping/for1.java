package corejava.looping;

import java.util.Scanner;

public class for1 {public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);

    for(int myrequirementplace=10;myrequirementplace > 0;){
        System.out.println("what is your experience");
        float experience=scan.nextFloat();
        if(experience >=4&&experience<=8){
            System.out.println("your selected in this process no:"+myrequirementplace);
            myrequirementplace--;
        }else{
            System.out.println("your not selected in this company");
        }
    }

}

}
