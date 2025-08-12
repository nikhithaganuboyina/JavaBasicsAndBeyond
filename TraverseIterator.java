//accessing elements in stack using iterators
import java.util.*;
public class TraverseIterator
{
     public static void main(String args[])
     {
           Stack<Integer> s=new Stack<>();
           s.push(80);
           s.push(75);
           s.push(69);
           s.push(1);
           Iterator<Integer> i=s.iterator();
           while(i.hasNext())
           {
                  System.out.println(i.next());
           }
       }
}
        
           
