
package basicjavaprogrames;

import java.util.Scanner;


class Primes
{
    static boolean prime(long num)
    {
        boolean isPrime = true;
        for(int i= 2; i<=num-1; i++)
            if(num%i == 0)
                isPrime = false;
        return isPrime;
    }
    static void generate(long max)
    {
        long c=1, num =2;
        while(c<=max)
        {
            if(prime(num))
            {
                System.out.println(num);
                ++c;
            }
            ++num;
        }
    }
}

public class PrimeNos {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        System.out.println("How Many primes? ");
        int max = kb.nextInt();
        Primes.generate(max);
    }
    
}
