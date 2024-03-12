class TypeConversion 
{
    public static void main(String[] args)
    {
        //Type conversion
        byte b = 126;
        int a = b;
        System.out.println(a);
        

        //Type Casting
        int i = 257;
        byte by = (byte)i;
        System.out.println(by);

        float f = 3.4f;
        int d = (int)f;
        System.out.println(d);

        //Type promotion
        byte x = 10;
        byte y = 30;
        int res = x*y;
        System.out.println(res);


    }
    
}
