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

    public static int countDigit_(int num , int d)
    {
        int count = 0;

        while(num != 0)
        {
            int ld = num % 10;
            num /= 10;

            if(ld == d)
            count++;
        }

        return count;
    }

    public static int decimalToAnyBase(int num , int b)
    {
        int ans = 0;
        int pow = 1;

        while(num != 0)
        {
            int rem = num % b;
            num /= b;

            ans = ans + rem * pow;
            pow *= 10;
        }

        return ans;
    }

    public static int anyBaseToDecimal(int num , int b)
    {
        int ans = 0;
        int pow = 1;

        while(num != 0)
        {
            int rem = num % 10;
            num /= 10;

            ans = ans + rem * pow;
            pow *= b;
        }

        return ans;
    }

    public static int anyBaseToAnyBase(int num , int b1 , int b2)
    {
        int dec = anyBaseToDecimal(num, b1);
        int ans = decimalToAnyBase(dec, b2);

        return ans;
    }

    public static int anyBaseAddition(int num1 , int num2 , int b)
    {
        int ans = 0;
        int pow = 1;
        int carry = 0;

        while(num1 > 0 || num2 > 0 || carry > 0)
        {
            int d1 = num1 % 10;
            num1 /= 10;

            int d2 = num2 % 10;
            num2 /= 10;

            int d = d1 + d2 + carry;

            carry = d / b;
            d = d % b;

            ans = ans + d * pow;
            pow = pow * 10;
        }

        return ans;
    }

    public static int anyBaseSubtraction(int num1 , int num2 , int b)
    {
        int ans = 0;
        int pow = 1;

        int carry = 0;

        while(num2 != 0)
        {
            int d2 = num2 % 10;
            num2 /= 10;

            int d1 = num1 % 10;
            num1 /= 10;

            int d = d2 - carry - d1;

            if(d < 0)
            {
                d = d + b;
                carry = 1;
            }
            else
            {
                carry = 0;
            }

            ans = ans + d * pow;
            pow *= 10;
        }

        return ans;
    }

    public static void Array_Demo()
    {
        int[] arr = new int[6];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;

        for(int i = 0 ; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static int span(int[] arr)
    {
        int n = arr.length;

        int max = -(int)1e9;
        int min = (int)1e9;

        for(int i = 0 ; i < n; i++)
        {
            if(arr[i] > max)
            max = arr[i];

            if(arr[i] < min)
            min = arr[i];
        }

        int span = max - min;

        return span;
    }

    public static int find(int[] arr , int num)
    {
        int n = arr.length;
        int idx = -1;

        for(int i = 0 ; i < n; i++)
        {
            if(arr[i] == num)
            {
                idx = i;
                break;
            }
        }

        return idx;
    }

    public static void additionOfArrays(int[] arr1 , int[] arr2)
    {
        int n1 = arr1.length;
        int n2 = arr2.length;

        int i = n1 - 1;
        int j = n2 - 1;

        int[] ans = new int[n2 > n1 ? n2 : n1];

        int k = ans.length - 1;

        int carry = 0;

        while(k >= 0)
        {
            int d = carry;

            if(i >= 0)
            d = d + arr1[i];

            if(j >= 0)
            d = d + arr2[j];

            carry = d / 10;
            d = d % 10;

            ans[k] = d;

            i--;
            j--;
            k--;
        }

        if(carry > 0)
        System.out.println(carry);

        for(int idx = 0; idx < ans.length; idx++)
        System.out.println(ans[idx]);
    }

    public static void barChart(int[] arr)
    {
        int max = -(int)1e9;

        for(int ele : arr)
        max = Math.max(max , ele);

        for(int i = max ; i >= 1; i--)
        {
            for(int j = 0 ; j < arr.length; j++)
            {
                if(arr[j] >= i)
                System.out.print("*\t");
                else
                System.out.print("\t");
            }

            System.out.println();
        }
    }

    public static void subtractArray(int[] arr1 , int[] arr2)
    {
        int n2 = arr2.length;
        int n1 = arr1.length;

        int i = n2 - 1;
        int j = n1 - 1;

        int[] ans = new int[n2];
        int k = n2 - 1;

        int carry = 0;

        while(k >= 0)
        {
            int d = arr2[i] - carry;

            if(j >= 0)
            d = d - arr1[j];

            if(d < 0)
            {
                d = d + 10;
                carry = 1;
            }
            else
            {
                carry = 0;
            }

            ans[k] = d;
            i--;
            j--;
            k--;
        }

        int idx = 0;

        while(idx < ans.length)
        {
            if(ans[idx] != 0)
            {
                break;
            }
            else
            {
                idx++;
            }
        }

        for(int x = idx ; x < ans.length; x++)
        System.out.println(ans[x]);
    }

    public static void reverse(int[] arr)
    {
        int n = arr.length;

        int i = 0;
        int j = n - 1;

        while(i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        for(int ele : arr)
        System.out.print(ele + " ");
    }

    public static void subArray(int[] arr)
    {
        int n = arr.length;

        for(int si = 0 ; si < n; si++)
        {
            for(int fi = si; fi < n; fi++)
            {
                for(int i = si; i <= fi; i++)
                System.out.print(arr[i]);

                System.out.println();
            }

            
        }
    }

    public static int[] inverseOfArray(int[] arr)
    {
        int[] inv = new int[arr.length];

        for(int i = 0 ; i < inv.length; i++)
        {
            inv[arr[i]] = i;
        }

        return inv;
    }

    public static void reverse(int[] arr , int i , int j)
    {
        while(i <= j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;


            i++;
            j--;
        }
    }

    public static void rotateAnArray(int[] arr , int k)
    {

        k = k % arr.length;

        if(k < 0)
        {
            k = k + arr.length;
        }


        reverse(arr , 0 , arr.length - k - 1);
        reverse(arr , arr.length - k , arr.length - 1);
        reverse(arr , 0 , arr.length - 1);

        for(int ele : arr)
        System.out.print(ele + " ");

    }

    public static void binarySearch(int[] arr , int data)
    {
        int i = 0;
        int j = arr.length - 1;
        int idx = -1;
        while(i <= j)
        {
            int mid = (i + j) / 2;

            if(data > arr[mid])
            i = mid + 1;
            else if(data < arr[mid])
            j = mid - 1;
            else
            {
                idx = mid;
                break;

            }

        }

        System.out.println(idx);
    }

    public static void subset(char[] arr)
    {
        int n = arr.length;

        

        int x = (1 << n);

        for(int i = 0 ; i < x; i++)
        {
            String str = "";
            int dec = i;
            for(int j = 0 ; j < arr.length; j++)
            {
                int rem = dec % 2;
                dec = dec / 2;

                if(rem == 0)
                str = "-\t" + str;
                else
                str = arr[n - 1 - j] + "\t" + str;
            }

            System.out.println(str);
        }
    }

    public static void fiAndLi(int[] arr , int data)
    {
        int fi = -1;
        int i = 0;
        int j = arr.length - 1;

        while(i <= j)
        {
            int mid = (i + j) / 2;

            if(arr[mid] < data)
            i = mid + 1;
            else if(arr[mid] > data)
            j = mid - 1;
            else
            {
                fi = mid;
                j = mid - 1;
            }
        }

       

        i = 0;
        j = arr.length - 1;

        int li = -1;

        while(i <= j)
        {
            int mid = (i + j) / 2;

            if(arr[mid] < data)
            i = mid + 1;
            else if(arr[mid] > data)
            j = mid - 1;
            else
            {
                li = mid;
                i = mid + 1;
            }
        }

        System.out.println(fi);
        System.out.println(li);
    }

    public static void floorAndCeil(int[] arr , int data)
    {
        int lo = 0;
        int hi = arr.length - 1;

        int floor = -1;
        int ceil = -1;
        while(lo <= hi)
        {
            int mid = (lo + hi) / 2;

            if(data < arr[mid])
            {
                ceil = arr[mid];
                hi = mid - 1;
            }
            else if(data > arr[mid])
            {
                floor = arr[mid];
                lo = mid + 1;
            }
            else
            {
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }
        }

        System.out.println(floor);
        System.out.println(ceil);
    }

    public static int anyBaseMultiplication(int num1 , int num2 , int b)
    {
        int ans = 0;
        int pow = 1;

        while(num2 != 0)
        {
            int singleProduct = getSingleDigitProduct(num1, num2 % 10, b);
            num2 /= 10;

            ans = anyBaseAddition_(ans, singleProduct * pow, b);
            pow *= 10;
        }

        return ans;
    }

    public static int getSingleDigitProduct(int num , int d , int b)
    {
        int pow = 1;
        int carry = 0;
        int ans = 0;

        while(num != 0 || carry != 0)
        {
            int dig = (num % 10) * d + carry;
            num /=10;

            carry = dig / b;
            dig = dig % b;

            ans = ans + dig * pow;
            pow = pow * 10;
        }

        return ans;
    }

    public static int anyBaseAddition_(int num1 , int num2 , int b)
    {
        int ans = 0;
        int pow = 1;
        int carry = 0;

        while(num1 != 0 || num2 != 0 || carry != 0)
        {
            int d = (num1 % 10) + (num2 % 10) + carry;
            carry = d / b;
            d = d % b;

            num1 /= 10;
            num2 /= 10;

            ans = ans + d * pow;
            pow *= 10;
        }

        return ans;
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
 //pattern_20();
 //System.out.println(countDigit_(scn.nextInt(), scn.nextInt()));
 //System.out.println(decimalToAnyBase(scn.nextInt() , scn.nextInt()));

 //System.out.println(anyBaseToDecimal(scn.nextInt() , scn.nextInt()));
 //System.out.println(anyBaseToAnyBase(scn.nextInt() , scn.nextInt() , scn.nextInt()));

 //System.out.println(anyBaseAddition(scn.nextInt() , scn.nextInt() , scn.nextInt()));
 //System.out.println(anyBaseSubtraction(scn.nextInt(), scn.nextInt(), scn.nextInt()));
 //Array_Demo();

//  int[] arr = {1 , 2 , 3 , 4 , 5 , 100};
//  //System.out.println(span(arr));
//  System.out.println(find(arr , scn.nextInt()));

// int[] arr1 = {9 , 9 , 9};
// int[] arr2 = {1};

// additionOfArrays(arr1, arr2);
    //     int[] arr = {6 , 4 , 2 , 1};
    //     barChart(arr);
    // int[] arr2 = {1 , 0 , 0 , 0};
    // int[] arr1 = {1};

    // subtractArray(arr1, arr2);

    // int[] arr = {4 , 6 , 2 , 4 , 3};
    // reverse(arr);

   // int[] arr = {1 , 2 ,3 , 4};
    //subArray(arr);
 //   int[] arr = {0 , 1 , 2 , 3 , 4};
    // int[] ans = inverseOfArray(arr);

    // for(int ele : ans)
    // System.out.print(ele + " ");

 //   rotateAnArray(arr, -2);

 //   binarySearch(arr, 100);
 //char[] arr = {'a' , 'b' , 'c'};
 //subset(arr);
//  int[] arr = {1 ,2 , 4  ,4 , 4 , 4 , 5, 6};
//  int data = 4;
//  fiAndLi(arr, data);

// int[] arr = {1 , 2 , 3 , 4 ,5 , 6 , 7 , 10};
// int data = 100;
// floorAndCeil(arr, data);

        System.out.println(anyBaseMultiplication(1234 , 56 , 8));
     }
}