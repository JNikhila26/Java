package Day5.Loops;

public class ForLoop {
    public static void main(String[] args){
        //Pyramid
        for(int i=0;i<=5;i++){
            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //Reverse Pyramid
        for(int i=5;i>=1;--i){
            for(int j=1;j<i;++j){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
