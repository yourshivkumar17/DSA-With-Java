import java.util.*;
public class MonoticArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int nums [] = new int[n];
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }
        boolean decreasing = true;
        boolean increasing = true;
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] > nums[i+1]) {
                increasing = false;
            } if(nums[i] < nums[i+1]) {
                decreasing = false;
            }
        }
        if(increasing || decreasing) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}
