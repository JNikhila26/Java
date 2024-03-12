class literals
{
    public static void main(String a[])
    {
        int num1 = 0b101; // base 2
        int num2 = 0x7E; // hexa decimal
        int num3 = 10_00_000;

        System.out.println(num1+" "+num2);

        double d1 = 12e10;
        double d2 = 56;

        System.out.println(d1+" "+d2);

        char c = 'a'; // char incrementation
        c++;

        int b = 'a';
        b++;
        System.out.println(c+" "+b);
    }
}