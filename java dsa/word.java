import java.util.*;

public class word {
    

    public static void main (String kk [])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[]arr=new char[s.length()];
        int j=0;
        for(int i =s.length()/2;i<s.length();i++)
        
        {
            arr[j]=s.charAt(i);
            j++;
        }
        for(int i =0;i<s.length()/2;i++)
        {
            arr[j]=s.charAt(i);
            j++;
        }

        for(int i=1;i<s.length();i++)
        {
            for(int k=1;k<=arr.length-1;k++)
            {
                System.out.print("");
            }

            for(int k=0;k<i;k++)
            {
                System.out.print(arr[k]);
            }
            System.out.println();
        }
    }
}
