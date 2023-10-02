package corejava.pOlymorphism;

public class MethodOverloding {
    public void calculate(String name1,String name2) {
        if (name1 == name2) {
            System.out.println("Your value is equal");
        } else {
            System.out.println("Your value is not eqval");
        }
    }

    public int calculate(int a,int b){
    int c=a+b;
        System.out.println(c);
    return c;
    }

    public void claculate(float ab,float ba){
        double abc =ab + ba;
        System.out.println("my float value is abc="+ abc);
    }

    public static void main(String[] args) {
        MethodOverloding over =new MethodOverloding();
        over.calculate(13,12);
        over.claculate(4.5f,4.6f);
        over.calculate("Bhuvana","Bhuvana");
    }
}


