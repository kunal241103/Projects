
class Pairs
{
   
   public static void gayatri(int kunal[])
   {
      for(int i=0;i<kunal.length;i++)
      {
        int curr=kunal[i];

        for(int j=i+1;j<kunal.length;j++)
        {
           System.out.print("("+curr+","+kunal[j]+")");
        }
        System.out.print("");
      }
     
   }
   
   
    public static void main (String kk[])
    {
         int kunal[]={2,4,5,6,7,8};
         gayatri(kunal);

    }
}