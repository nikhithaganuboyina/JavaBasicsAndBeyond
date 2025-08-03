import java.util.Scanner;
class UniquePrime
{
   Boolean isPrime(int n)
   {
       if(n<=1)
       {
           return false;
       }
       for(int i=2;i*i<=n;i++)
       {
              if(n%i==0)
              {
                  return false;
              }
       }
       return true;
   }
  void findPrimes(int n)
  {
        for(int i=1;i<=n;i++)
        {
             if(isPrime(i))
             {
                 System.out.println(i+ " ");
             }
        }
  }
  void findUniquePrimeFactors(int n) 
   {
        System.out.print("Unique prime factors: ");
        for (int i=2;i<=n;i++) 
        {
            if (n%i==0&&isPrime(i)) 
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

  public static void main(String args[])
 {
      UniquePrime obj=new UniquePrime();
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      obj.findUniquePrimeFactors(n);
   }   
}
