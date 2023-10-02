package corejava.p0lymorphism;

public class Methodoverriding1 {
    public void number(int a, int b) {
        if (a == b || a <= b) {
            System.out.println("the statement is true");
        } else {
            System.out.println("the statement is false");
        }
    }

    public static void main(String[] args) {
        Methodoverriding1 bv = new Methodoverriding1();
        bv.number(24, 15);
        Methodoverriding ab = new Methodoverriding();
        ab.number(15, 20);
    }
}
