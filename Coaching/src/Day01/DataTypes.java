package Day01;

public class DataTypes {
    public static void main(String args[]) {
        DataTypes mf = new DataTypes();
        mf.myFunction();
    }
    static  int a = 100; // 4 Bytes
    short s = 2; // 2 Bytes
    long l = 1234; // 8 Bytes
    float f = 23.4f; // 4 Bytes
    double d = 34.999999999; // 8 Bytes
    char c = 'N'; // Mandatory Single quotes // 1 Bytes
    String S = "Nikhila"; //Mandatory Double quotes // 4 Bytes
    boolean b = true; // 2 Bytes
    void myFunction() {
        System.out.println(a);
        System.out.println(s);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(S);
        System.out.println(b);
    }
    // 1 Byte = 8 Bits
}


