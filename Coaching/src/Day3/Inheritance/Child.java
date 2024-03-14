package Day3.Inheritance;

public class Child extends Parent{

    void method1(){
        System.out.println("Hi Child");
    }
    void method2(){
        System.out.println("Hi Child");
    }

public static void main(String args[]){
        Child c = new Child();
        c.method2();
        c.method1();

        Parent p = new Child();
        ((Child) p).method1();
        ((Child) p).method2();

      // p.method2();

    }
}
