class Sumsubarray
{
   public static void maximum(int kunal[])
   {
    int curr=0;
    int max=Integer.MIN_VALUE;

    for(int i=0;i<kunal.length;i++)
    {
        int start=i;

        for(int j=i;j<kunal.length;j++)
        {
            int end =j;
            curr=0;

            for(int k=start;k<=end;k++)
            {
                curr+=kunal[k];
            }
            System.out.println(curr);
            if(max<curr)
            {
                max=curr;
            }
        }
    }
    System.out.println("max sum = " +max);
   }
   
   
   
   
   
   
   
   
   
    public static void main (String kk[])
    {
        int kunal[]={-1,2,6,-2,3};

        maximum(kunal);
    }
}