public class quicksort {

   public static void kunal(int arr[],int si,int ei)
   {
    if(si >= ei)
    {
        return 
        ;

    }

    int ptd= partation(arr,si,ei);
    kunal(arr,si,ptd-1);
    kunal(arr,ptd+1,ei);
   }

   public static int partation(int arr[], int si,int ei)
   {
    int pivot = arr[ei];
    int i=si-1;

    for(int j=0;j<ei;j++)
    {
       if(arr[j] <= pivot)
        {
          i++;

          //swapping

          int temp=arr[j];
          arr[j]=arr[i];
          arr[i]=temp;

        }

       
    }
    i++;

    //swapping

    int temp=pivot;
    arr[ei]=arr[i];
    arr[i]=temp;


    return i;

   }


   public static void printt(int arr[])
   {
    for(int i =0;i<arr.length;i++)
    {
        System.out.print(arr[i] +"");
    }

    System.out.println();
   }
   
 public static void main (String kk[])
    {
        int arr[]={6,3,9,2,5,8};
        kunal(arr,0,arr.length-1);
        printt(arr);

    }
    
}
