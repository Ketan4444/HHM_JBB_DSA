import java.util.*;
public class hhm_bsicss
{
    public static Scanner scn = new Scanner(System.in);
    public static void printZ()
    {
        System.out.println("*****");
        System.out.println("   *");
        System.out.println("  *");
        System.out.println(" *");
        System.out.println("*****");
    }


    public static void tozunderstandVariables()
    {  // int , long , short , byte , char , boolean , float , double
        int x = 10;
        System.out.println(x);
    }

    public static void gradingSystem(int num)
    {
        if(num > 90)
        System.out.println("excellent");
        else if(num > 80)
        System.out.println("good");
        else if(num > 70)
        System.out.println("fair");
        else if(num > 60)
        System.out.println("meets expectations");
        else
        System.out.println("below par");
    }


    public static void printEvenOdd(int num)
    {
        if(num % 2 == 0)
        System.out.println("Even");
        else
        System.out.println("Odd");
    }

    public static void print3K(int num)
    {
        if(num % 3 == 0)
        System.out.println("3K");
        else if(num % 3 == 1)
        System.out.println("3k + 1");
        else
        System.out.println("3K + 2");
    }


    public static void printingUsingLoop()
    {
        int i = 1;

        while(i <= 10)
        {
            System.out.println(i);
            i++;
        }

        System.out.println("This is Done");
    }

    public static void input()
    {
        int num = scn.nextInt();
        System.out.println("Input is " + num);
    }

    public static void print1ToN(int n)
    {
        int i = 1;

        while(i <= n)
        {
            System.out.println(i);
            i++;
        }

        System.out.println("This is Done");
    }

    public static void print1ToNOddEven(int n)
    {
        int i = 1;

        while(i <= n)
        {
            if(i % 2 == 0)
            System.out.println(i + " is even");
            else
            System.out.println(i + " is odd");

            i++;
        }

        System.out.println("This is Done");
    }

    public static void isPrime_()
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for(int i = 1; i <= t; i++)
        {
            int num = scn.nextInt();

            int count = 0;

            for(int div = 1; div <= num; div++)
            {
                if(num % div == 0)
                count++;
            }

            if(count == 2)
            System.out.println("prime");
            else
            System.out.println("not prime");
        }
    }

    public static void isPrime__()
    {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        for(int i = 1; i <= t; i++)
        {
            int num = scn.nextInt();
            boolean isPrime = true;
            for(int div = 2; div < num; div++)
            {
                if(num % div == 0)
                {
                    isPrime = false;
                    break;
                }

            }

            if(isPrime)
            System.out.println("prime");
            else
            System.out.println("not prime");
        }
    }

    public static void isPrime___()
    {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        for(int i = 1; i <= t; i++)
        {
            int num = scn.nextInt();
            boolean isPrime = true;

            for(int div = 2; div <= num / 2; div++)
            {
                if(num % div == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)
            System.out.println("prime");
            else
            System.out.println("not prime");
        }
    }

    public static void isPrime____()
    {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        for(int i = 1; i <= t; i++)
        {
            int num = scn.nextInt();

            boolean isPrime = true;

            for(int div = 2; div * div <= num; div++)
            {
                if(num % div == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)
            System.out.println("prime");
            else
            System.out.println("not prime");
        }
    }

    public static void printBtwRange()
    {
        Scanner scn = new Scanner(System.in);
        int lo = scn.nextInt();
        int hi = scn.nextInt();

        for(int num = lo; num <= hi; num++)
        {
            boolean isPrime = true;

            for(int div = 2; div * div <= num; div++)
            {
                if(num % div == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)
            System.out.println(num);
        }
    }

    public static void printNFibo()
    {
        int n = scn.nextInt();

        int a = 0;
        int b = 1;

        for(int i = 1; i <= n; i++)
        {
            int c = a + b;
            System.out.println(a);
            a = b;
            b = c;
        }
    }

    public static void countDigits()
    {
        int n = scn.nextInt();

        int count = 0;

        while(n != 0)
        {
            n /= 10;
            count++;
        }

        System.out.println(count);
    }

    public static void printDigits()
    {
        int num = scn.nextInt();
        
        int div = 1;
        int temp = num;

        while(temp >= 10)
        {
            temp /= 10;
            div *= 10;
        }

        while(div >= 1)
        {
            int quo = num / div;
            int rem = num % div;

            num = rem;
            System.out.println(quo);
            div /= 10;
        }
    }

    public static void inverseOfNum()
    {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        int inv = 0;
        int p = 1;

        while(num != 0)
        {
            int rem = num % 10;
            num /= 10;

            inv = inv + p*(int) Math.pow(10 , rem - 1);
            p++;
        }

        System.out.println(inv);
    }
    public static void main(String[] args)
    { 

        //printZ();
        //tozunderstandVariables();
        //gradingSystem(scn.nextInt());
        //printEvenOdd(scn.nextInt());
        //print3K(scn.nextInt());
       // printingUsingLoop();
       //input();
       //print1ToN(scn.nextInt());
       //print1ToNOddEven(scn.nextInt());
      // isPrime_();
      //isPrime__();
     // isPrime___();
      // isPrime____();
     // printBtwRange();
     //printNFibo();

     //countDigits();
    // printDigits();
    //inverseOfNum();

    }
}