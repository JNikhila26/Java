//Develop a program that generates all possible permutations of a given string using recursion.
public class StringPermutation {
    public static void main(String[] args) {
        permute("", "ABC");
    }
    private static void permute(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permute(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
            }
        }
    }
}
