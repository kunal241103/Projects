
class prefixarray
{

    public static void maximun(int kunal[])
    {
        int curr=0;
        int max=Integer.MIN_VALUE;
        int prefix[]= new int [kunal.length];

       prefix[0]=kunal[0];

       for(int i =1;i<prefix.length;i++)
       {
        prefix[i]=prefix[i-1]+kunal[i];
       }

        for(int i=0;i<kunal.length;i++)
        {
            int start=i;

            for(int j=i;j<kunal.length;j++)
            {
                int end=j;

                curr=start==0 ? prefix[end]:prefix[end]-prefix[start-1];
            }

            if(max<curr)
            {
                max=curr;
            }
        }
        System.out.println("max subarray = " +max);
    }
   
   
   
   
   
   
   
    public static void main (String kk[])
    {
        int kunal[]={1,-2,6,-1,3};
        maximun(kunal);
    }
}