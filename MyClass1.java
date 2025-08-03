import java.util.*;
public class MyClass1
{
     public static void main(String args[])
     {
          LinkedList <Integer> a=new LinkedList<>();
          a.add(40);
          a.add(44);
          a.add(80);
          a.add(75);
          for(Integer x:a)
          {
               System.out.println(x + " ");
          }
     }
}