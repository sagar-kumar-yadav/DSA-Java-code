package sagar;

public class Comparison {
    public static void main(String[] args) {
        String a = "Sagar";
        String b = "Sagar";
        String c = a;
        System.out.println(c == a);

        System.out.println(a == b);

        String name1 = new String("sagar");
        String name2 = new String("sagar");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
    }
}
