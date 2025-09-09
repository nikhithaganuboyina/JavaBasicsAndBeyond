import java.util.HashMap;
import java.util.Scanner;
public class Pangram {
    static boolean isPangram(String s1) {
        HashMap<Character, Boolean> map=new HashMap<>();
        s1=s1.toLowerCase();
        for (int i=0;i<s1.length();i++) 
        {
            char ch=s1.charAt(i);
            if (ch>='a'&&ch<='z') 
            {
                map.put(ch,true);
            }
        }
        return map.size()==26;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String a=sc.nextLine();
        if (isPangram(a)) 
        {
            System.out.println("Pangram");
        } 
        else 
        {
            System.out.println("Not a Pangram");
        }
    }
}
