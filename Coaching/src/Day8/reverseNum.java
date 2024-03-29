package Day8;

/*
public class reverseNum {
    public static void main(String[] args){
        int num = 23456;
        int res = 0;
        while(num>0){
            int temp = num%10;
            res = res*10+temp;
            num /= 10;
        }
    System.out.println(res);
    }

}
*/
public class reverseNum {
    public static void main(String[] args) {
        int num = 23456;

        String s = "";
        s = String.valueOf(num);

        String rs = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rs = rs + s.charAt(i);
        }
        System.out.println(rs);
        StringBuilder sh = new StringBuilder();
        sh.append("Nikhila");
        System.out.println(sh.reverse());
    }
}