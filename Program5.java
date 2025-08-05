//you are given array of n elements remove all duplicate elements acc to input array order  
import java.util.Scanner;
import java.util.HashSet;
class Program5
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
              if(!Hs.contains(a[i]))
              {
                  Hs.add(a[i]);  
                  System.out.println(a[i]);
              }
        }
    }
}
         
