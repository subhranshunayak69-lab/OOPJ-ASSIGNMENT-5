import java.lang.*;
import java.util.*;

class A5Q4
{
    public static void main(String args[])
    {
        int n, i, low, high, mid, target;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input size of the array");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Input the array");

        for(i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to be search");
        target = sc.nextInt();

        low = 0;
        high = n - 1;

        while(low <= high)
        {
            mid = low + (high - low) / 2;

            if(arr[mid] == target)
            {
                System.out.println("Element found at index " + mid);
                break;
            }
            else if(arr[mid] < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
    }
}