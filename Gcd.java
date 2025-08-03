import java.util.Scanner;
class Gcd 
{
    public static int gcd(int n,int m) 
    {
        while(n%m!=0) 
        {
            int r=n%m;
            n=m;
            m=r;
        }
        return m;
    }
    public static int gcdarray(int[] arr) 
    {
        int result=arr[0];
        for(int i=1;i<arr.length;i++) 
        {
            result=gcd(result,arr[i]);
        }
        return result; 
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n]; 
        for(int i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(gcdarray(arr));
        sc.close();     
     }
}