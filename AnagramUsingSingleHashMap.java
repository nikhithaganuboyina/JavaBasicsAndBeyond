//using single hashMap
import java.util.*;
public class AnagramUsingSingleHashMap 
{
    static boolean areArray(String s1, String s2) 
    {
        if(s1.length()!=s2.length())
            return false;
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s1.length();i++) 
        {
            hm.put(s1.charAt(i),hm.getOrDefault(s1.charAt(i),0)+1);
        }
        for(int i=0;i<s2.length();i++) 
        {
            char c=s2.charAt(i);
            if(!hm.containsKey(c))
                return false;
            hm.put(c,hm.get(c)-1);
            if (hm.get(c)==0)
                hm.remove(c);
        }
        return hm.isEmpty();
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1=sc.nextLine();
        System.out.print("Enter second string: ");
        String s2=sc.nextLine();
        if (areArray(s1,s2))
            System.out.println("Anagrams");
        else
            System.out.println("NOT Anagrams");
        sc.close();
    }
}
