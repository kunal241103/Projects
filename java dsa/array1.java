
public class array1 {
      
    public static void kunal (int marks [])
    {
        for(int i =0;i<marks.length;i++)
        {
            marks[i]=marks[i]+1;
        }
    }
    
    
    public static void main (String kk[])
      {
        int marks[] ={98,78,44}; 
        kunal(marks);

        for(int i =0;i<marks.length;i++)
        {
            System.out.print(marks[i]+ " ");
        }
        System.out.println();
      }
}
