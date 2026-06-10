import java.util.*;
public class FindPeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }
        int start = 0;
        int end = nums.length-1;
        while(start<end) {
            int mid = start + (end-start) /2;
            if(nums[mid] > nums[mid+1]) {
                end = mid;
            }else {
                start = mid+1;
            }
        }
        System.out.println(start);
    }
}