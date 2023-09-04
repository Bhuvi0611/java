package corejava.inheritance.Encapsulation;
class Employee{
    public int Emid;
    public String Ename;
    public String companyname;
    public String Location;

    public int getEmid()
    {
        return Emid;
    }
    public void setEmid(int emid){
        Emid=emid;
    }
    public String getEname()
    {
       return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }
    public String getCompanyname()
    {
        return companyname;
    }
    public void setCompanyname(String companyname){
        this.companyname=companyname;
    }
    public String getLocation()
    {
        return Location;
    }
    public void setLocation(String location){
        Location=location;
    }
}
public class Details {
    public static void main(String[] args) {
    Employee bv=new Employee();
    bv.setEmid(5001);
    bv.setEname("Bhuvana");
    bv.setCompanyname("TCS");
    bv.setLocation("chennai");

    Employee bv1=new Employee();
    bv1.setEmid(5002);
    bv1.setEname("vasanth");
    bv1.setCompanyname("TCS");
    bv1.setLocation("chennai");

        System.out.println(bv.getEmid()+"\n"+bv.getEname()+"\n"+bv.getCompanyname()+"\n"+bv.getLocation());
        System.out.println(bv1.getEmid()+"\n"+bv1.getEname()+"\n"+bv1.getCompanyname()+"\n"+bv1.getLocation());
    }
}
