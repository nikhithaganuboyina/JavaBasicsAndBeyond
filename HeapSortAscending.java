import java.util.*;
public class HeapSortAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) 
        {
            minHeap.add(num);
        }
        int index = 0;
        while (!minHeap.isEmpty()) 
        {
            arr[index++] = minHeap.poll();
        }
        System.out.println("Sorted array in ascending order:");
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
