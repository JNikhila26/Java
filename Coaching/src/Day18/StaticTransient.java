import java.io.Serializable;

public class StaticTransient implements Serializable {
    static int staticVariable = 110; // static variable
    transient int transientVariable = 120; // transient variable
    public static void main(String[] args) {
        StaticTransient obj = new StaticTransient();
        obj.transientVariable = 30; // transient variable value can be modified
        System.out.println("Static Variable: " + staticVariable);
        System.out.println("Transient Variable: " + obj.transientVariable);
    }
}