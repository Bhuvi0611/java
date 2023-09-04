package corejava.inheritance;
class Office
{
    public void details()
    {
        String OfficeName="bhuvi tailaring";
        String Place="METTUR";
        System.out.println("OfficeName is:"+OfficeName);
        System.out.println("Location:"+Place);
    }
}
class Workers extends Office{
    public void workdetails()
    {
        String Name="Bhuvaneshwari";
        String name1="Yasodha";
        System.out.println("Worker Name is:"+Name);
        System.out.println("Another Worker Name is:"+name1);
    }
}
class Students extends Workers
{
    public void coursedetails()
    {
        System.out.println("arei works");
        System.out.println("stitching");

    }
}
public class multilevel {
    public static void main(String[] args) {
        Students bv=new Students();
        bv.details();
        bv.workdetails();
        bv.coursedetails();
    }

}
