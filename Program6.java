//you are given array of n elements remove all duplicate elements in ascending order  
import java.util.Scanner;
import java.util.HashSet;
class Program6
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
         HashSet<Integer> Hs=new HashSet<>();
         for(int i=0;i<n;i++)
         {
              Hs.add(a[i]);
         }
         for(int val:Hs)
         {
            System.out.println(val);
         }
    }
}
         
