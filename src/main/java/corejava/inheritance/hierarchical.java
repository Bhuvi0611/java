package corejava.inheritance;

import java.sql.SQLOutput;

class Father
{
    public void family()
    {
        String Name="Arun prasath";
        String mother="Yasodha";
        System.out.println(Name);
        System.out.println(mother);
    }
}
class child extends Father
{
    public void details()
    {
       String sname="Bhuvana";
       String favname="vasanth";
        System.out.println(sname);
        System.out.println(favname);
    }
}
class realtives extends Father
{
    public void relativedetails()
    {
        int age=19;
        String rname="siva";
        System.out.println(age);
        System.out.println(rname);
    }
}
public class hierarchical {
    public static void main(String[] args) {
        realtives bv=new realtives();
        bv.family();
        bv.relativedetails();
        child c=new child();
        c.details();
    }
}
