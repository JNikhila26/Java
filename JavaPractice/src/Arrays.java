//import java.util.Arrays;
public class Arrays{
    public static void main(String[] args){
        int[] num = new int[5];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        int[] digits = {2,3,5,1,4};
        int[][] md1 = new int[2][3];
        md1[0][0] = 1;
        int[][] md2 = {{1,2,3},{4,5,6}};
        System.out.println(num);
        // Methods
        System.out.println(java.util.Arrays.toString(num)); 
        System.out.println(num.length); 
        //System.out.println(sort(digits));
        System.out.println(java.util.Arrays.deepToString(md1)); 
        System.out.println(java.util.Arrays.deepToString(md2)); 
    //Constats
        final float PI = 3.14f;
        float pi =1; //can't assign
        System.out.println(pi); 
        System.out.println(PI);   
    //Arthimetic Operators
        double res = (double)10 / (double)3;
        System.out.println(res);
        int x = 1;
        int y = x++;
        int a = 1;
        int b = ++a;
        System.out.println(+x+","+y+","+a+","+b);
    }
}