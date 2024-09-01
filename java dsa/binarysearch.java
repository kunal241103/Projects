public class binarysearch {
     public static int binary(int kunal[],int key)
    {
        int start=0;
        int end =kunal.length-1;
        int mid=(start+end)/2;
        while(start<=end)
        {
            

            if(kunal[mid]==key)
            {
                return mid;
            }
            if(kunal[mid]<=key)
            {
                start=mid+1;

            }
            else
            {
                end=mid-1;
            }
        }

        return -1;
    }
    public static void main (String kk [])
    {
        int kunal[]={2,4,6,8,10,12,14};
        int key =10;

        System.out.print("index of array is =" +binary(kunal,key));

    }
}
