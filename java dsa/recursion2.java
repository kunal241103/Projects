
public class recursion2 {

     public static int inc(int n)
     {
        if(n==0)
        {
          //  System.out.println(1);
            return 1;
        }
       int f=inc(n-1);
       int fn= n * inc(n-1);
       return fn;
     }

     public static int sum(int n)
     {
        if(n==1)
        {
            return 1;
        }

        int fn=sum(n-1);
        int fm=n+fn;
        return fm;
     }
    
     public static int fino(int n)
     {
        if(n==0 || n==1)
        {
            return n;
        }
        int fn1=fino(n-1);
        int fn2=fino(n-2);
        int fn=fn1+fn2;
        return fn;

     }

     public static boolean issorted(int arr[],int i)
     {
        if(i==arr.length-1)
        {
            return true;
        }

        if(arr[i] > arr[i+1])
        {
            return false;
        }

        return issorted(arr,i+1);
     }
    public static void main (String kk[])
    {

        int arr[]={1,2,3,4};
       // Scanner sc = new Scanner (System.in);
        //System.out.print("enter number =" );
        //int n=sc.nextInt();
      
       System.out.print(issorted(arr,0));
    }
    
}
