import java.util.*;
public class SecondLargestElement {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] nums = new int[n];
         for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
         }
    int largest = nums[0];
    int secondlargest = nums[0];
    for(int i=1; i<n; i++) {
        if(nums[i] > largest) {
           secondlargest = largest;
           largest = nums[i];
        }
        else if(nums[i] > secondlargest && nums[i] != largest) {
            secondlargest = nums[i];
        }
    }
    System.out.println(secondlargest);
    }
}