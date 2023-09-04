package corejava.variables;

public class demovariable {
    static String ooty="cooling place";//static variable
    String coorg="to visit karnataka";//global variable
    public void Haii()
    {
        String name="Bhuvana";//local variable
        System.out.println(name);
        System.out.println(ooty);
        System.out.println(coorg);
    }

    public static void main(String[] args) {
        int data=40;
        int data1=50;
        System.out.println(data);//instance variable
        System.out.println(data1);
        System.out.println(ooty);
        demovariable v= new demovariable();
        v.Haii();
    }
}


