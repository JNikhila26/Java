package Day7;

public class StaticEx {
    int a = 10; // Instance variable
    static int b = 15;
    public void method1(){
         a = 10;
    }
    public void method2(){
         a = 20;
    }
    public static void method3(){
         b = 25;
    }

    public static void main(String[] args){
        StaticEx s1 = new StaticEx();
        System.out.println("Initial a :"+s1.a);
        System.out.println("Initial b :"+s1.b);
        s1.method2();
        System.out.println("After method2 call :"+s1.a);
        s1.method3();

        StaticEx s2 = new StaticEx();
        System.out.println("a val :"+s2.a);
        System.out.println("After method3 call :"+s2.b);
        b=12;
        System.out.println(s2.b);

    }
}
