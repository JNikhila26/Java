package Day6;

public class StringPool {
    public static void main(String[] args){
    String s = "nikki";
    String k = "nikki";

    //hashCode() --> to find address of a string variable
        System.out.println(s+" : "+" "+s.hashCode());
        System.out.println(k+" : "+" "+k.hashCode());
        s += "J";
        System.out.println(s+" : "+" "+s.hashCode());
        System.out.println(k+" : "+" "+k.hashCode());
    }
}
