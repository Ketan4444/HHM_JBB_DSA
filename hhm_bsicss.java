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

    public static void printOddEven(int num)
    {
        if(num % 2 == 0)
        System.out.println(num + " is even");
        else
        System.out.println(num + " is odd");
    }

    public static void print3K(int num)
    {
        if(num % 3 == 0)
        System.out.println("3K");
        else if(num % 3 == 1)
        System.out.println("3K + 1");
        else
        System.out.println("3K + 2");
    }

    public static void printCount()
    {
        int i = 1;
        while(i <= 5)
        {
            System.out.println(i);
            i++;
        }

        System.out.println("I am out of loop");
    }

    public static void gradingSystem(int num)
    {
        if(num > 90)
        System.out.println("Excellent");
        else if(num > 80)
        System.out.println("Good");
        else if(num > 70)
        System.out.println("Fair");
        else if(num > 60)
        System.out.println("meets expectations");
        else
        System.out.println("below par");
    }

    public static void printOddEvenInput()
    {
        int num = scn.nextInt();

        int i = 1;

        while(i <= num)
        {
            if(i % 2 == 0)
            System.out.println(i + " is even");
            else
            System.out.println(i + " is odd");

            i++;
        }
    }
    public static void main(String[] args)
    {
        //printZ();
        //printOddEven(scn.nextInt());
        //print3K(scn.nextInt());
        //printCount();
        //gradingSystem(scn.nextInt());
        printOddEvenInput();
    }
}