import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> uniqueElements = new HashSet<>();
        
        int maxUniqueCount = 0;
        
        for (int i = 0; i < n; i++) {
            deque.add(arr[i]);
            uniqueElements.add(arr[i]);
            
            if (deque.size() > m) {
                int removed = deque.remove();
                if (!deque.contains(removed)) {
                    uniqueElements.remove(removed);
                }
            }
            
            if (deque.size() == m) {
                maxUniqueCount = Math.max(maxUniqueCount, uniqueElements.size());
            }
        }
        
        System.out.println(maxUniqueCount);
        scanner.close();
    }
}
