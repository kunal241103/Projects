 public class mergesort
 {
    

    public static void printt(int arr[])
    {
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void kunal(int arr[],int si,int ei)  // sd=startind index ed= end index
    {

        if(si>=ei)
        {
            return;
        }
        int mid=si+(ei-si)/2;
        kunal(arr,si,mid);
        kunal(arr,mid+1,ei);
        vivek(arr,si,ei,mid);

    }

    public static void vivek(int arr[],int si,int ei,int mid)
    {
        int temp[]=new int [ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<= mid && j<= ei)
        {
            if(arr[i]< arr[j])
            {
                temp[k]=arr[i];
                i++;
            }
            else
            {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid)
        {
            temp[k++]=arr[i++];
        }

        while(j <= ei)
        {
            temp[k++]=arr[j++];
        }


        for(k=0,i=si;k<temp.length;k++,i++)
        {
           arr[i]=temp[k];
        }
    }

   

   
   public static void main (String kk [])
    {
        int arr[]={6,3,9,5,2,8};
        kunal(arr,0,arr.length-1);
        printt(arr);
    }
 }