import java.util.Scanner;
class Swappm2
{
    public static void main(String args[]) 
   {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       System.out.println("Before swap: " + a + ", " + b);
       int t=a;
       a=b;
       b=t;
       System.out.println("After swap: " + a + ", " + b);
       sc.close();
    }
}
