import java.util.*;
public class SingleElementInSortedArray {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++) {
            nums[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i+=2) {
            if(nums[i] != nums[i+1]) {
                System.out.println(nums[i]);
                return;
            }
        }
        System.out.println(nums[n-1]);
    }
}
