import java.util.Scanner;
class Lcma{
    int lcm(int n,int m)
    {
        int x=Math.max(m,n);
        int y=Math.min(m,n);
        for(int i=x;i<=m*n;i=i+x)
        {
            if(i%y==0)
            {
                return i;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
       Lcma a=new Lcma();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter m value");
       int m=sc.nextInt();
       System.out.println("Enter n value");
       int n=sc.nextInt();
       System.out.println(a.lcm(m,n));

    }
}