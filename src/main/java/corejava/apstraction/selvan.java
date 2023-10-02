package corejava.apstraction;

public class selvan extends abstraction{
    @Override
    public void arithmeticoperator(int a, int b) {
        System.out.println(a==b&&a<b);
        System.out.println(a<b||b!=a);
    }

    @Override
    public void additional(int a, int b) {
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a%b);
    }

    public static void main(String[] args) {
        selvan ab=new selvan();
        ab.additional(20,10);
        ab.arithmeticoperator(20,13);
    }
}
