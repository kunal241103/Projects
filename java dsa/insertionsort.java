public class insertionsort {

    public static void main (String args[])
    {
        int arr[]={5,4,2,3,1};
        insertion(arr);
        printt(arr);

    }

    public static void insertion(int arr[])
    {
        for(int i =1;i<arr.length;i++)
        {
            int curr=arr[i];
            int prev =i-1;
            // finding out the correct position to insertion
            while(prev>=0 && arr[prev] > curr)
            {
               arr[prev+1]=arr[prev];
               prev--;
            }

            //insertion
            arr[prev+1]=curr;
        }
    }


    public static void printt(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] +" ");
        }

        System.out.println();
    }
    
}