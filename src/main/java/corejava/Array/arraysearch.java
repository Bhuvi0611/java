package corejava.Array;

import java.util.Scanner;

public class arraysearch {
    public static void main(String[] args) {
        String[] emotion = {"happy", "sad", "normal", "sleepy","boring"};
        Scanner scan = new Scanner(System.in);

        System.out.println(emotion.length);
        System.out.println("tell us what is your current emotion");
        String emo = scan.next();

        for (int pos = 0; pos < emotion.length; pos++) {
            if (emo.equalsIgnoreCase(emotion[pos])) {
                System.out.println(emo + "emotion is founded");
                return;
            }
        }
        System.out.println(emo + "emotion is not founded");
    }

}

