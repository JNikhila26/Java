package Day2;

public class Const {
    int x;

    //constructor doesn't have return type
    //constructor Starts with class name
    Const(int a,int b){
        System.out.println(a);
        System.out.println(b);
    }
    //Empty const
    Const(){
    }
    void method1() {
        System.out.println("Hello");
    }

public static void main(String args[]){
    Const t = new Const(12,23);
    t.method1();
    System.out.println(t.x);
}
}
// while creating an object it checks whether class has it's
// const, if it exists it checks the parameters and returns
// if const isn't exists it create as an object and calls by method
//if arg constructor,must need to declared
//if not, if it's a default const no need to declared