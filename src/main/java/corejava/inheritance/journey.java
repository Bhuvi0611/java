package corejava.inheritance;

public class journey extends SRT implements Travels,KPN{
    public void details()
    {
        System.out.println("Both the travels all over Tamilnadu to covered the bus");
    }

    public void Sleeper() {
        System.out.println("comfort the bus");
    }
    public void Volvo(){
        System.out.println("Its a Costlest Bus in comfort level are high");
    }

    public static void main(String[] args) {
        journey bv=new journey();
        bv.details();
        bv.Sleeper();
        bv.Volvo9600();
        bv.Volvo();

    }
}
