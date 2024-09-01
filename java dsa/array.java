import java.util.*;

public class array {

    public static void main (String kk [])
    {
        int marks [] = new int[50];

        Scanner gayatri = new Scanner (System.in);

        marks[0]=gayatri.nextInt(); // phy
        marks[1]=gayatri.nextInt(); // maths
        marks[2]=gayatri.nextInt(); // chem

        System.out.println("phy "+marks[0]);
        System.out.println("maths "+marks[1]);
        System.out.println("chem "+marks[2]);

        int percentage = (marks[0]+marks[1]+marks[2])/3;

        System.out.println("percentage =" +percentage +"%");

        System.out.println("lenght of array =" +marks.length);

        

    }
    
}
