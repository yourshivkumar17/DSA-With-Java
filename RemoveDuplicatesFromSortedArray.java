import java.util.*;
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for(int i=1; i<n; i++) {
            nums[i] != nums[k-1];
            nums[k] = nums[i];
            k++;
        }
    }
}