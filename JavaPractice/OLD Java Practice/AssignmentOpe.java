class AssignmentOpe 
{
    public static void main(String args[])
    {
        int num = 10;
        int a = 4;
        num += 1;
        num -= 1;
        num /= a;
        num %= a;
        System.out.println(num);

        // Pre/Post Increment
        int pre = 5;
        int post = 10;
        int res = ++pre;
        int ans = post++;
        System.out.println(res+ " "+ans+ " Post:"+post);
    }
}