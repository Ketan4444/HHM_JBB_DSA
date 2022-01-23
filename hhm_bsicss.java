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
       print1ToNOddEven(scn.nextInt());

    }
}