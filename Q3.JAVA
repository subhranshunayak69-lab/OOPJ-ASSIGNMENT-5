import java.lang.*;
import java.util.*;

class A5Q3
{
    public static void main(String args[])
    {
        int i, j, n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input size of the array");
        n = sc.nextInt();

        System.out.println("Input the array");

        int a[] = new int[n];

        for(i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Before Sorting");

        for(i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        int temp;

        for(i = 0; i < n; i++)
        {
            for(j = 0; j < n - i - 1; j++)
            {
                if(a[j] > a[j + 1])
                {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println("After Sorting");

        for(i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}