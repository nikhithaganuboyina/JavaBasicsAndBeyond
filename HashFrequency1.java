import java.util.*;
import java.util.Scanner;
class HashFrequency1
{
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
                a[i]=sc.nextInt();
         }
         HashMap <Integer,Integer> hm=new HashMap<>();
         for(int i=0;i<n;i++)
         {
              hm.put(a[i],hm.getOrDefault(a[i],0)+1);
         } 
         Set <Integer>s1=hm.keySet();
         for(int x:s1)
         {
              System.out.println(x + " "+hm.get(x));
         }
    }
}