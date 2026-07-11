import java.util.*;
public class CountOperationToObtainZero {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nums1  = sc.nextInt();
    int nums2 = sc.nextInt();
    int count =0;
    while(nums1!=0 && nums2!=0) {
        if(nums1>=nums2) {
          nums1 = nums1 - nums2;
        }
        else {
            nums2 = nums2-nums1;
        }
        count++;
    }
    System.out.println(count);
    sc.close();
}
}