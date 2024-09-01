import java.util.*;
public class recursion3 {

    public static int forward(int arr[],int key,int i)
    {

          if(i==key)
          {
            return i;
          }
          else{
             return -1;
          }

          

         
          
    }
    
    
    public static void main (String kk[])
    {
        int arr []={8,6,0,0,3,3,7,3};
        Scanner sc =new Scanner (System.in);
        int key = sc.nextInt();

        System.out.print(forward(arr,key,0));
    }
    
}
