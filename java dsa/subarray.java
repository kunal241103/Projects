

public class subarray
{
    
    public static void sub(int kunal[])
    {
        int tp=0;
        for(int i =0;i<kunal.length;i++)
        {
            int start=kunal[i];

            for(int j=i;j<kunal.length;j++)
            {
                int end=kunal[j];

                for(int k=start;k<=end;k++)
                {
                   System.out.print(kunal[k] +" ");
                }
                tp++;
                System.out.println("");
            }
            System.out.println("");
        }

        System.out.println("total subarray" +tp);

    }
    
    
    
    
    public static void main (String kk[])
    {
        int kunal[]={2,3,4,5,6};

        sub(kunal);
    }
}