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


    public static void printDigitsInReverse()
    {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        while(num != 0)
        {
            int rem = num % 10;
            num /= 10;
            System.out.println(rem);
        }
    }

    public static void rotateANumber()
    {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int k = scn.nextInt();

        int nod = 0;
        int temp = num;

        while(temp != 0)
        {
            temp /= 10;
            nod++;
        }

        k = k % nod;

        if(k < 0)
        k = k + nod;

        int div = 1;
        int mul = 1;

        for(int i = 1 ; i <= nod; i++)
        {
            if(i <= k)
            div = div * 10;
            else
            mul = mul * 10;
        }

        int quo = num / div;
        int rem = num % div;

        int ans = rem * mul + quo;
        System.out.println(ans);
    }

    public static void gcdAndLCM()
    {
        Scanner scn = new Scanner(System.in);

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        int on1 = num1;
        int on2 = num2;

        while(num1 % num2 != 0)
        {
            int rem = num1 % num2;

            num1 = num2;
            num2 = rem;
        }

        int gcd = num2;

        int lcm = (on1 * on2) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }

    public static void primeFactorization()
    {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        for(int div = 2 ; div * div <= num; div++)
        {
            while(num % div == 0)
            {
                System.out.print(div + " ");
                num /= div;
            }
        }


        if(num > 1)
        System.out.print(num);
    }

    public static void benjaminBulbs()
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for(int i = 1 ; i * i <= n; i++)
        {
            System.out.println(i * i);
        }
    }

    public static void pattern_1()
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            System.out.print("*\t");

            System.out.println();
        }
    }

    public static void pattern_2()
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = n;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= nst; j++)
            System.out.print("*\t");

            nst--;
            System.out.println();
        }
    }

    public static void pattern_3()
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int nst = 1;
        int nsp = n - 1;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= nsp; j++)
            System.out.print("\t");

            for(int j = 1; j <= nst; j++)
            System.out.print("*\t");

            nsp--;
            nst++;
            System.out.println();
        }
    }

    public static void pattern_4()
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nsp = 0;
        int nst = n;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= nsp; j++)
            System.out.print("\t");

            for(int j = 1; j <= nst; j++)
            System.out.print("*\t");

            nst--;
            nsp++;
            System.out.println();
        }
    }

    public static void pattern_5()
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int nsp = n / 2;
        int nst = 1;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= nsp; j++)
            System.out.print("\t");

            for(int j = 1; j <= nst; j++)
            System.out.print("*\t");


            if(i <= n / 2)
            {
                nst += 2;
                nsp--;
            }
            else
            {
                nst -= 2;
                nsp++;
            }

            System.out.println();
        }
    }

    public static void pattern_7()
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(i == j)
                System.out.print("*\t");
                else
                System.out.print("\t");
            }

            System.out.println();
        }
    }

    public static void pattern_6()
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int nst = n /2 + 1;
        int nsp = 1;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= nst; j++)
            System.out.print("*\t");

            for(int j = 1; j <= nsp; j++)
            System.out.print("\t");

            for(int j = 1; j <= nst; j++)
            System.out.print("*\t");


            if(i <= n / 2)
            {
                nst--;
                nsp += 2;
            }
            else
            {
                nst++;
                nsp -= 2;
            }

            System.out.println();
        }
    }

    public static void pythagoreantriplet()
    {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int max = a;

        if(b > max)
        max = b;

        if(c > max)
        max = c;

        if(max == a)
        {
            if(a * a == b * b + c * c)
            System.out.println(true);
            else
            System.out.println(false);

        }
        else if(max == b)
        {

            if(b * b == a * a + c * c)
            System.out.println(true);
            else
            System.out.println(false);

        }
        else
        {

            if(c * c == a * a + b * b)
            System.out.println(true);
            else
            System.out.println(false);

        }
    }

    public static void pattern_8()
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(i + j == n + 1)
                System.out.print("*\t");
                else
                System.out.print("\t");
            }

            System.out.println();
        }
    }

    public static void pattern_9()
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(i == j || i + j == n + 1)
                System.out.print("*\t");
                else
                System.out.print("\t");
            }

            System.out.println();
        }
    }

    public static void pattern_11()
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int val = 1;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(val++ + "\t");
            }

            System.out.println();
        }
    }

    public static void pattern_12()
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int a = 0;
        int b = 1;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(a + "\t");

                int c = a + b;
                a = b;
                b = c;
            }

            System.out.println();
        }
    }

    public static void pattern_14()
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for(int i = 1; i <= 10; i++)
        {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    public static void pattern_15()
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int nst = 1;
        int nsp = n / 2;
        int val = 1;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= nsp; j++)
            System.out.print("\t");

            int cval = val;

            for(int j = 1; j <= nst; j++)
            {
                System.out.print(cval + "\t");
                if(j <= nst / 2)
                cval++;
                else
                cval--;
            }


            if(i <= n / 2)
            {
                val++;
                nst += 2;
                nsp--;
            }
            else
            {
                val--;
                nst -= 2;
                nsp++;
            }

            System.out.println();
        }
    }

    public static void pattern_10()
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int nspO = n / 2;
        int nspI = -1;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= nspO; j++)
            System.out.print("\t");

            System.out.print("*\t");

            for(int j = 1; j <= nspI; j++)
            System.out.print("\t");

            if(i > 1 && i < n)
            System.out.print("*\t");

            if(i <= n / 2)
            {
                nspO--;
                nspI += 2;
            }
            else
            {
                nspO++;
                nspI -= 2;
            }

            System.out.println();
        }
    }

    public static void pattern_13()
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for(int i = 0 ; i < n; i++)
        {
            int val = 1;

            for(int j = 0 ; j <= i; j++)
            {
                System.out.print(val + "\t");
                val = val * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }

    public static void pattern_16()
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = 1;
        int nsp = 2 * n - 3;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= nst; j++)
            {
                System.out.print(j + "\t");
            }

            for(int j = 1; j <= nsp; j++)
            {
                System.out.print("\t");
            }

            if(i == n)
            {
                nst--;
            }

            for(int j = nst; j >= 1; j--)
            {
                System.out.print(j + "\t");
            }

            nst++;
            nsp -= 2;
            System.out.println();
        }
    }

    public static void pattern_17()
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int nsp = n / 2;
        int nst = 1;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= nsp; j++)
            {
                if(i == n / 2 + 1)
                System.out.print("*\t");
                else
                System.out.print("\t");
            }

            for(int j = 1; j <= nst; j++)
            {
                System.out.print("*\t");
            }

            if(i <= n / 2)
            {
                nst++;
            }
            else
            {
                nst--;
            }

            System.out.println();
        }
    }

    public static void pattern_18()
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int nsp = 0;
        int nst = n;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= nsp; j++)
            System.out.print("\t");

            for(int j = 1; j <= nst; j++)
            {
                if(i > 1 && i <= n / 2 && j > 1 && j < nst)
                System.out.print("\t");
                else
                System.out.print("*\t");
            }

            if(i <= n / 2)
            {
                nsp++;
                nst -= 2;
            }
            else
            {
                nsp--;
                nst += 2;
            }

            System.out.println();
        }
    }

    public static void pattern_19()
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(i == 1)
                {
                    if((j >= 1 && j <= n / 2 + 1) || j == n)
                    System.out.print("*\t");
                    else
                    System.out.print("\t");
                }
                else if(i < n / 2 + 1)
                {
                    if(j == n / 2 + 1 || j == n)
                    System.out.print("*\t");
                    else
                    System.out.print("\t");
                }
                else if(i == n / 2 + 1)
                {
                    System.out.print("*\t");
                }
                else if(i < n)
                {
                    if(j == 1 || j == n / 2 + 1)
                    System.out.print("*\t");
                    else
                    System.out.print("\t");
                }
                else
                {
                    if(j == 1 || j >= n / 2 + 1)
                    System.out.print("*\t");
                    else
                    System.out.print("\t");
                }
            }

            System.out.println();
        }
    }

    public static void pattern_20()
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(j == 1 || j == n)
                System.out.print("*\t");
                else if((i >= n /2 + 1) && (i == j || i + j == n + 1))
                System.out.print("*\t");
                else
                System.out.print("\t");
            }

            System.out.println();
        }
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
    //printDigitsInReverse();
    //rotateANumber();
   // gcdAndLCM();
   //primeFactorization();
   //benjaminBulbs();
   //pattern_1();
   //pattern_2();
   //pattern_3();
   //pattern_4();
   //pattern_5();
   //pattern_7();
  // pythagoreantriplet();
 // pattern_6();
 //pattern_8();
 //pattern_9();
 //pattern_11();
 //pattern_12();
 //pattern_14();
 //pattern_15();
 //pattern_10();
 //pattern_13();
 //pattern_16();
 //pattern_17();
 //pattern_18();
 //pattern_19();
 pattern_20();

    }
}