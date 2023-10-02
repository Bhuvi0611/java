package corejava.Stringmethods;
import java.lang.StringBuffer;
public class Stringbuffer1 {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("bhuvana");// original

        //Append
        s.append("vasanth");// append string
        System.out.println(s);

        //insert
        s.insert(9,"bhuvi");
        System.out.println(s);
        //replace
        s.replace(1, 3, "hello");
        System.out.println(s);
        s.delete(1, 2);
        System.out.println(s);
        s.reverse();
        System.out.println(s);

        java.lang.StringBuffer ss= new java.lang.StringBuffer("arun");
        ss.delete(0,3);
        System.out.println(ss);
    }
}

