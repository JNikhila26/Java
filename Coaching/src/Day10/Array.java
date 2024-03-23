package Day10;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s = new String[6];
        int i = 0;
        /*int[] a = new int[5];
        float[] f = new float[11];
        a[0] = 34;
        a[1] = 44;
        a[6] = 6;
        a[9] = 10;
        System.out.println(a);*/
        System.out.println("Enter the value : ");

//hasnext() : To check if scanner has another token in i/p
//nextInt() : To scans the next tokens of i/p as "int".
//class Scanner elaborates, nextInt() method of this class is used to scan or parse the input.
        while(i<s.length && sc.hasNext()){
            String val = sc.next();
            s[i] = val;
            i++;
        }

        for(String b:s)
            System.out.print(b+",");
    }
}
