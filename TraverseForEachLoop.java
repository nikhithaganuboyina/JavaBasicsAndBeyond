//Accesing elements in stack using foreach loop
import java.util.*;
public class TraverseForEachLoop
{
     public static void main(String args[])
     {
           Stack<Integer> s=new Stack<>();
           s.push(80);
           s.push(75);
           s.push(69);
           s.push(1);
           for(Integer x:s)
           {
                System.out.println(x);
           }
      }
}
        
           
