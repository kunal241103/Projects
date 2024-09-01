

public class array3 {
    

    public static int largest(int kunal[])
    {
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i =0;i<kunal.length;i++)
        {
            if(largest<kunal[i])
            {
                largest=kunal[i];
            }

            if(smallest>kunal[i])
            {
                smallest=kunal[i];
            }
        }
        System.out.println("smallest number" + smallest);
        return largest;
        
    }

    public static void main (String kk [])
    {
        int kunal[] ={8,6,0,0,3,7,5,3,3,6};

        
        
            System.out.println("largest number" +largest(kunal));
        

        
    }
}
