package Day16;

public class Main {
    public static void main(String[] args) {
        String s="Guntur";

        StringBuilder sb=new StringBuilder();
        sb.append(s.charAt(s.length()-1));
        for (int i=s.length()-2;i>=0;i--){

            sb.append(Character.toUpperCase(s.charAt(i)));
        }
        System.out.println(sb.toString());
    }
}
