import java.util.*;

class A5Q4 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the elements in sorted order:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter element to search:");
        int key = sc.nextInt();

        System.out.println("Enter 1 for Ascending order");
        System.out.println("Enter 2 for Descending order");
        int choice = sc.nextInt();

        int low = 0;
        int high = n - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (a[mid] == key) {
                System.out.println("Element found at position " + (mid + 1));
                found = true;
                break;
            }

            if (choice == 1) {

                // Ascending order
                if (a[mid] < key) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            } else if (choice == 2) {

                // Descending order
                if (a[mid] > key) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            } else {
                System.out.println("Invalid choice.");
                break;
            }
        }

        if (!found && (choice == 1 || choice == 2)) {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}