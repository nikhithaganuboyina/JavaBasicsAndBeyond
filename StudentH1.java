import java.util.*;
public class StudentH1
{
   public static void main (String args[])
   {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Double> hm1=new HashMap<>();   
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
               System.out.println("Enter roll number");
               int roll=sc.nextInt();
               System.out.println("Enter CGPA for student");   
               double cgpa=sc.nextDouble();
               hm1.put(roll,cgpa);
        }
        System.out.println("\nRoll No --CGPA");
        for(Map.Entry<Integer,Double>e:hm1.entrySet())
        {
               Integer key=e.getKey();
               Double value=e.getValue();
               System.out.println(key+ " " +value);
        }
    }
}

 
       



