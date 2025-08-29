// Given an array of N elements, sort the array elements in ascending order using Max Heap
import java.util.*;
public class HeapSortAscendingUsingMaxHeap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];       
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : arr) {
            maxHeap.add(num);
        }
        int index = n - 1; 
        while (!maxHeap.isEmpty()) {
            arr[index--] = maxHeap.poll();
        }
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
