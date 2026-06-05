import java.util.Scanner;

public class SqrtX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int start = 0;
        int end = x;
        int ans = 0;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if ((long) mid * mid == x) {
                System.out.println(mid);
                return;
            }

            if ((long) mid * mid < x) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(ans);
    }
}