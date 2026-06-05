import java.util.*;
public class ValidPerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int start =0;
        int end = num;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if((long) mid * mid == num) {
                System.out.println(true);
                return;
            }
            if((long) mid * mid < num) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        System.out.println(false);
    }
}
