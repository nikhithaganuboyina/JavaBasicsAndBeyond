//Accesing elements in stack using listIterator
import java.util.*;
public class TraverseListIterator
{
     public static void main(String args[])
     {
           Stack<Integer> s=new Stack<>();
           s.push(80);
           s.push(75);
           s.push(69);
           s.push(1);
           ListIterator<Integer> i=s.listIterator();
           while(i.hasNext())
           {
                  System.out.println(i.next());
           }
       }
}
        
           
