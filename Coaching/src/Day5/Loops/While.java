package Day5.Loops;

public class While {
    public static void main(String[] args){
        int a = 1;
        int b = 6;
        while(a<b){
            System.out.println("while Loop :"+a);
            a++;
        }
        System.out.println("-------do-while Loop starts-------");
        a=3;
        do{
            System.out.println("do-while Loop :"+a);
            a++;
        }while(a<b);
    }
}
