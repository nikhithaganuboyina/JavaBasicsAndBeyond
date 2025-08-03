import java.util.Scanner;
class Lcm{
    int lcm(int m,int n)
    {
        int a=gcd(m,n);
        return (m*n)/a;
    }
    int gcd(int m,int n)
   {
       while(n%m!=0)
       {
           int r=n%m;
           n=m;
           m=r;
       }
       return m;
   }
    public static void main(String args[])
   {
       Lcm a=new Lcm();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter m value");
       int m=sc.nextInt();
       System.out.println("Enter n value");
       int n=sc.nextInt();
       System.out.println(a.lcm(m,n));
   }


}