import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Collections;
public class UsingEnumeration 
{
    public static void main(String[] args) 
    {
        int n=5;
        ArrayList<Integer> l=new ArrayList<>();
        for (int i=1;i<=n;i++) 
        {
            l.add(i);
        }
        System.out.println("using Enumeration:");
        Enumeration<Integer> e=Collections.enumeration(l);
        while(e.hasMoreElements()) 
        {
            System.out.println(e.nextElement());
        }
    }
}

