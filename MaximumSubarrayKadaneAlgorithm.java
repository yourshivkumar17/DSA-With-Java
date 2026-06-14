import java.util.*;
public class MaximumSubarrayKadaneAlgorithm {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    for(int i=0; i<n; i++) {
        nums[i] = sc.nextInt();
    }
    int currSum = nums[0];
    int maxSum = nums[0];
    for(int i=1; i<n; i++) {
        currSum = Math.max(nums[i], currSum+nums[i]);
        maxSum = Math.max(maxSum, currSum);
    }
    System.out.println(maxSum);
}
}

