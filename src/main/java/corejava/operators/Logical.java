package corejava.operators;

public class Logical {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;
        int c = 40;
        System.out.println(a>b||a>c);
        System.out.println(a<b&&a>c);
        System.out.println(!(a==b));
        System.out.println((a!=b));

        System.out.println("welcome to Mettur");

        String state = "tamil nadu";
        String state1 = "tamil nadu";
        int height=189;
        int weight=85;
        System.out.println(state==state1 && height!=weight);
        System.out.println(state1=="madhurai" || "tamil nadu"==state1);
        System.out.println((!(weight > 75)));
    }

}
