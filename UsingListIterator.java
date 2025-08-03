import java.util.ArrayList;
import java.util.ListIterator;
public class UsingListIterator 
{
    public static void main(String[] args) 
    {
        int n=5;
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=1;i<=n;i++) 
        {
            list.add(i);
        }
        System.out.println("Printing using ListIterator:");
        ListIterator<Integer> listIterator=list.listIterator();
        while (listIterator.hasNext()) 
        {
            System.out.println(listIterator.next());
        }
    }
}
