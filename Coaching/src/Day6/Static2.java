package Day6;

public class Static2 {

    static int a = 10;
    static Static1 s1 = null;
    static String s = null;
    static public void method1(){
        a=20;//Override
        s1=new Static1();
        if(s1!=null) //'if' not mentioned it throws NullPointerException
            s1.testStatic1();
    }
    static public void method2(){

    }
    public static void main(String[] args){
        //If static declared no need to create Instances
//        Static2 s2 = new Static2();
//        s2.method1();
//        System.out.println(s2.a);
//        System.out.println(Static2.a);
//        System.out.println(Static2.s); //nullPointerException
        System.out.println(Static2.a);
        Static2.method1();
    }
}
