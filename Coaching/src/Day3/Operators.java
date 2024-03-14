package Day3;

public class Operators {
    int a = 20;
    int res = 0;
    // Arthemetic Operators : +,-,/,%,++,--
    void arthemeticCalc(int a,int b){
        res = a + b;
        a++; //postInc
        b--;
        --a; //preDecr
        System.out.println("res : "+res);
        System.out.println("a : "+ a+" " +"b : "+b);
        return;
    }
    // Assignment Operators : +=,-=,=
    void assignmentOperators(int b){
        a+=3;
        b-=1;
        System.out.println("a : "+ a+" " +"b : "+b);
    }
    // Comparision Operators : <=,>=,==,!=
    void comparisonOperators(int b) {
        if (a==b)
        System.out.println(true);
        else
            System.out.println(false);

        System.out.println(a>=b);
    }
    // Logical Operators : $$-AND, ||-OR, ~-NOT
    void logicalOperators(int a,int b,int c){
        System.out.println((a == b) && (b<=c));
    }
    void bitwiseOperators(int a,int b){
        System.out.println(a<<b);
    }

public static void main(String args[]){
    Operators check = new Operators();
    check.arthemeticCalc(3,7);
    check.assignmentOperators(8);
    check.comparisonOperators(12);
    check.logicalOperators(2,3,2);
    check.bitwiseOperators(2,2);
    }
}
