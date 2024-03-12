public class ifelse 
{
    public static void main(String args[])
    {
        int x = 13;
        if (x%2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        int a = 12;
        boolean res =  true;
        res = a%2 == 0 ? true : false;
        System.out.println(res);
    }
    
}
