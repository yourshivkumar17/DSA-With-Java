import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int start =0;
        int end = arr.length-1;
        int target = sc.nextInt();
        int index = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                index = mid;
                break;
            }
            if(target > arr[mid]) {
                start = mid+1;
            }
            else {
                end = end-1;
            }
        }
         if(index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
    }
}
}
