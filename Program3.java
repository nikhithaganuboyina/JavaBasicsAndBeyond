//here given array of n elements and find frequency of each element in the array print elements and frequency acc to descending order of elements    
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Set;
import java.util.Collections;
class Program3
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
         TreeMap<Integer,Integer> tm=new TreeMap<>(Collections.reverseOrder());
         for(int i=0;i<n;i++)
         {
              if(!tm.containsKey(a[i]))
              {
                  tm.put(a[i],1);  
              }
              else
              {
                  tm.put(a[i],tm.get(a[i])+1);
              }
         }
         for(Integer N:tm.keySet())
         {
               System.out.println(N + " " +tm.get(N));
         }
      }
}
         
          
                
               