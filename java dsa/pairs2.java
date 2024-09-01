public class pairs2 {
    public static void kk(int gk[])
    {
        for(int i=0;i<gk.length;i++)
        {
            int curr=gk[i];
            for(int j=i+1;j<gk.length;j++)
            {
                System.out.print("("+curr+","+gk[j]+")");
            }
            System.out.println("");
        }
    }
    public static void main(String strg[])
    {
        int gk[]={2,3,4,5,6};
        kk(gk);

    }
    
}
