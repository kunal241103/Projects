public class recursion {
    
public static void printdec(int n)
{
    for(int i=50;i>=-50;i--)
    {
        System.out.println( +i);
    }
}

public static void dec(int n)
{
    if(n==0)
    {
        System.out.println(0);
        return;
    }

    System.out.println(n);
    dec(n-1);
}
    public static void main (String kk[])
    {
        int n=50;
        //printdec(n);
        dec(n);
    }
}
