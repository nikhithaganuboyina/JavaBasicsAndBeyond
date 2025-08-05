import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Set;
class Program13
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int k=sc.nextInt();
       int a[]={4,2,7,7,3,3,3,6,2};
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
        Set<Integer> s=hm.keySet();
        for(int x:s)
         {
                 if(hm.get(x)>=k)
                    System.out.println(x);
         }
   }
}