package corejava;
class Lion
{
    public void Hunt()
    {
        System.out.println("Lion hunt the animals");
    }
}
class polarbear extends Lion{
    public void Ice()
    {
        System.out.println("polar bear is the survive of cooling places");
    }
}
public class single {
    public static void main(String[] args) {
        polarbear v=new polarbear();
        v.Ice();
        v.Hunt();
    }

}
