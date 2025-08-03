import java.util.Scanner;
class Swappm5 {
    public static void main(String args[]) 
   {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt(); 
        int b=sc.nextInt(); 
        System.out.println("Before swap: " + a + ", " + b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swap: " + a + ", " + b);
        sc.close();
    }
}
