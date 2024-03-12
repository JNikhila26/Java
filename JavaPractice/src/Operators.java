public class Operators {
public static void main(String[] args){
    System.out.println("........Comparision Operators........."); //Comparision Operators
        int x = 1;
        int y = 1;
        System.out.println(x==y);
        System.out.println(x<=y);
        System.out.println(x>y);
    System.out.println("........Logical Operators.........");  //Logical Operators
        int temp =22;
        boolean isWarm = temp > 20 && temp <25;
        boolean tCheck = temp < 20 && temp != 0;
        System.out.println(isWarm);
        System.out.println(tCheck);
    System.out.println("........If Else.........");  // IfElse Statements
        int a = 12;
        int b = 3;
        if (a>b){
            System.out.println("A is Large");
        }
        else 
            System.out.println("A is small");
    System.out.println(".........Ternary Operators.......");  //Ternary Operators
        int m = 20;
        String res = m > 15 ? "Yes" : "No";
        System.out.println(res);
    }    
}
