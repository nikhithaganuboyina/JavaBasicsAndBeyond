//you are given array of n elements remove all duplicate elements in descending order  
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Collections;
class Program7
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int[] a=new int[n];
         for(int i=0;i<a.length;i++)
         {
              a[i]=sc.nextInt();
         }

         TreeSet<Integer> ts=new TreeSet<>(Collections.reverseOrder());
         for(int i=0;i<n;i++)
         {
              ts.add(a[i]);
         }
         for(int val:ts)
         {
            System.out.println(val);
         }
    }
}
        