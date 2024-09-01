public class backtracking {
       

    public static void changearr(int kunal[],int i,int value)
    {
        if(i==kunal.length)
        {
            printarr(kunal);
            return;
        }

        kunal[i]= value;
        changearr(kunal,i+1,value+1);
        kunal[i]=kunal[i]-2;


    }


    public static void printarr(int kunal[])
    {
        for(int i=0;i<kunal.length;i++)
        {
           System.out.print(kunal[i] + " ");
        }

        System.out.println("");
    }

    public static void main (String kk [])
    {
        int kunal []= new int [5];
        changearr(kunal,0,1);
        printarr(kunal);
    }
}
