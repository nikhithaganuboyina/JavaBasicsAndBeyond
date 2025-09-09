import java.util.*;
public class AnagramUsingTwoHashMaps 
{
    static boolean areArray(String s1, String s2) 
    {
        if (s1.length()!=s2.length())
            return false;
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        for (int i=0;i<s1.length();i++) 
        {
            hm1.put(s1.charAt(i),hm1.getOrDefault(s1.charAt(i),0)+1);
            hm2.put(s2.charAt(i),hm2.getOrDefault(s2.charAt(i),0)+1);
        }
        for (Map.Entry<Character,Integer> e:hm1.entrySet()) 
        {
            char ch=e.getKey();
            if(!hm2.containsKey(ch))
                return false;
            if(!e.getValue().equals(hm2.get(ch)))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
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