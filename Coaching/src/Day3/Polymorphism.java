package Day3;

public class Polymorphism {
    //Method OverLoading - Same parameters but diff method types
    void check1(int a){
        System.out.println(a++);
    }
    int check2(int a,int b){
        return a+b;
    }
    float check3(float a,float b){
        return a+b;
    }
    float check4(float a,int b){
        return a+b;
    }
public static void main(String args[]){
    Polymorphism p = new Polymorphism();
    p.check1(2);
    System.out.println(p.check2(3,4));
    System.out.println(p.check3(5,8));
    System.out.println(p.check4(11,4));
    }
}
