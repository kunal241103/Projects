

class reverse
{



    public static void rev(int gayatri[])
    {
        int first=0;
        int last =gayatri.length-1;
        
        while(first<last)
        {
            int temp = gayatri[first];
            gayatri[first]=gayatri[last];
            gayatri[last]=temp;
             first++;
             last--;
        }
    }
    public static void main (String kk[])
    {
        int gayatri[]={5,4,3,2,1};

        rev(gayatri);

        for(int i =0;i<gayatri.length;i++)
        {
            System.out.println(gayatri[i] +"");
        }

    }
}