import java.util.*;
public class max_heap {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        PriorityQueue<String> pq = new PriorityQueue<>(Collections.reverseOrder());
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) 
        {
            String s = sc.nextLine();
            pq.add(s);
        }
        System.out.println("Traversing using iterator:");
        Iterator<String> it = pq.iterator();
        while (it.hasNext()) 
        {
            System.out.println(it.next() + " ");
        }
        sc.close();
    }
}