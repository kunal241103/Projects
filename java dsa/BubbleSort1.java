public class BubbleSort1 {
    
public static void kunal(int arr[])
{
    int n=arr.length;
    for(int i=0;i<n-1;i++)
    {
        for(int j=0;j<n-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
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
    
    
    
    
    
    
    
    
    
    
    public static void main (String args [])
    {
        int arr[]={8,6,0,0,3,7};
        kunal(arr);
        printt(arr);
    }
}
