//here given array of n elements and find frequency of each element in the array print elements and frequency acc to order of elements in input array     
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Set;
class Program1
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
         LinkedHashMap<Integer,Integer>hm=new LinkedHashMap<>();
         for(int i=0;i<n;i++)
         {
              if(!hm.containsKey(a[i]))
              {
                  hm.put(a[i],1);  
              }
              else
              {
                  hm.put(a[i],hm.get(a[i])+1);
              }
         }
         for(Integer N:hm.keySet())
         {
               System.out.println(N + " " +hm.get(N));
         }
      }
}
         
          
                
               