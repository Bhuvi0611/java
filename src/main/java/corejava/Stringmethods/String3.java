package corejava.Stringmethods;

public class String3 {
    public static void main(String[] args) {
        String a="kanmani";
        System.out.println(a.startsWith("k"));
        System.out.println(a.endsWith("i"));
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(3));
        System.out.println(a.length());
        String s="Nothing more than happiness.happy the faces";
        String replace=s.replace("happy","feel");
        System.out.println(replace);
        String s1="bhuvana loves yasodha";
        String s2=s1.replace("bhuvana","yasodha");
        System.out.println(s2);


    }
}

