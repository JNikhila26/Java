import java.util.Scanner;
public class Loops {
    public static void main(String[] args){
        // For Loop
        for(int i=1;i<=3;i++)
            System.out.println("Nikhila J :" +i);
            System.out.println("............................." );
        for(int i=3;i>0;i--) 
            System.out.println("Nikhila J :" +i);//Reverse
            System.out.println("............................." );
        // While Loop
        int x = 1;
        while(x<4){
            System.out.println("Num :" +x);
            x ++;
        }
        String input = " ";
        Scanner sc = new Scanner(System.in);
        while(!input.equals("quit")){
            System.out.print("Enter Input : ");
            input = sc.next().toLowerCase();
            if(input.equals("quit"))
                break;
                System.out.println(input);
        }}}
