import java.util.ArrayList;
public class UsingLambda 
{
    public static void main(String[] args) 
    {
        int n=5;
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 1; i <= n; i++) 
        {
            list.add(i);
        }
        System.out.println("Printing using Lambda Expression:");
        list.forEach(num->System.out.println(num));
    }
}
