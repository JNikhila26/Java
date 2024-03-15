package Day3;

public class MethodOverLoading {
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
    MethodOverLoading p = new MethodOverLoading();
    p.check1(2);
    System.out.println(p.check2(3,4));
    System.out.println(p.check3(5,8));
    System.out.println(p.check4(11,4));
    }
}
//Method OverLoading - diff parameters but same method types
