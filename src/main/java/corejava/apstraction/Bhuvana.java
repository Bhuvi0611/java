package corejava.apstraction;

public class Bhuvana extends abstraction{
    @Override
    public void arithmeticoperator(int a, int b) {
        int c = a * b;
        System.out.println(c);
    }

    @Override
    public void additional(int a, int b) {
        int c = a % b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Bhuvana ab=new Bhuvana();
        ab.additional(20,17);
        ab.arithmeticoperator(3,6);
    }
}
