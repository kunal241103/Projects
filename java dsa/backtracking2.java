class backtracking
{


    public static void findsubset(String kunal,String ans,int i)
    {
        if(i==kunal.length())
        {
            System.out.println(ans +" ");
            return;
        }

        findsubset(kunal,ans+kunal.charAt(i),i+1);
        findsubset(kunal,ans,i+1);

    }
    public static void main (String agrs[])
    {

        
       String kunal ="vishwajeet";
        findsubset(kunal,"",0);
    }
}