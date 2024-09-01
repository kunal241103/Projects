
class kandanes
{


    public static void gayatri(int kunal[])
    {
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<kunal.length;i++)
        {
            curr=curr+kunal[i];
            if(curr<0)
            {
                curr=0;
            }
            max=Math.max(curr,max);
        }

        System.out.print("maximun array is =" +max);
    }
    public static void main (String kk[])
    {
        int kunal []={-2,-3,4,-1,-2,1,5,-3};
        gayatri(kunal);
    }
}