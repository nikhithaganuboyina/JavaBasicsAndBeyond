//Given a Array of N elements sort the Array elements in descending order using Max heap
import java.util.*;
public class HeapSortDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : arr) 
        {
            maxHeap.add(num);
        }
        int index = 0;
        while (!maxHeap.isEmpty()) 
        {
            arr[index++] = maxHeap.poll();
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
