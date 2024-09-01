public class array2 {
   
   
    public static int gayatri(int kunal[],int key)
    {
        for(int i =0;i<kunal.length;i++)
        {
            if(kunal[i]==key)
            {
                return i;
            }
        }

        return  -1;
    }
   
   
    public static void main (String kk [])
    {
        int kunal[]={2,3,4,5,61,23,43,56};
        int key = 4;

        int index = gayatri(kunal,key);

        if(index==-1)
        {
            System.out.println("key not found");
        }else
        {
            System.out.println("key found " + index);
        }

    }
}
