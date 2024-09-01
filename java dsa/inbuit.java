import java.util.Arrays;

public class inbuit {

    public static void main (String args [])
    {
        int arr[] = {8,9,8,3,1,8,8,6,4,5};

        Arrays.sort(arr);
        printt(arr);

      
    }
    public static void printt(int arr[])
    {
        for(int i =0;i<arr.length;i++)
        {
          System.out.print(arr[i] +" ");

        }

        System.out.println();

    }
    



    
}
