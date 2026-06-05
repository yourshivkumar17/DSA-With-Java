import java.util.*;
public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = arr.length-1;
        int target = sc.nextInt();
        while(start <= end) {
            int mid = start +(end -start) / 2;
            if(arr[mid] == target) {
                System.out.println(mid);
                return;
            }
            if(target > arr[mid]) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        System.out.println(start);
    }
}
