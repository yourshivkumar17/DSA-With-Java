import java.util.*;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int xor =0;
        int total = arr.length+1;
        for(int i=1; i<=total; i++) {
            xor ^= i;
        }
        for(int i=0; i<n; i++) {
            xor ^= arr[i];
        }
        System.out.println(xor);
    }
}