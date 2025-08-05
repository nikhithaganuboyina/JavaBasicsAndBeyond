//you are given array of n elements find elements with frequency 2(exactly 2 times)  
import java.util.Scanner;
import java.util.LinkedHashMap;
class Program10
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
         LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<>();
       for(int i=0;i<a.length;i++)
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
        for(int x:hm.keySet())
         {
                 if(hm.get(x)>2)
                    System.out.println(x);
         }
         
     }
}
        