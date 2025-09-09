//Anagram using sorting
import java.util.*;
public class AnagramUsingSort 
{
    static boolean areAnagramUsingSort(String s1,String s2) 
    {
        if(s1.length()!=s2.length()) 
        {
            return false;
        }
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1=sc.nextLine();
        System.out.print("Enter second string: ");
        String s2=sc.nextLine();
        if (areAnagramUsingSort(s1,s2))
            System.out.println("Anagrams");
        else
            System.out.println("NOT Anagrams");

        sc.close();
    }
}