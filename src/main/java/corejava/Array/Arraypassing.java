package corejava.Array;

import java.util.Arrays;

public class Arraypassing {
    public void passingarray(double[] salary1)
    {
        salary1[3]=3456.89;
        salary1[0]=5678.768;
        System.out.println(Arrays.toString(salary1));
    }
    public void passingarray2(String name1)
    {
        System.out.println("welcome");
    }
    public static void main(String[] args) {
        int a=100;
        String name="Bhuvana";
        double[] salary={112.4,34.45,85.7,63.5,45.89};
        Arraypassing pass=new Arraypassing();
        pass.passingarray(salary);
        pass.passingarray2(name);
        System.out.println(name);
    }
}
