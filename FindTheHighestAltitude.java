import java.util.*;
public class FindTheHighestAltitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }
        int altitude = 0;
        int  maxAltitude = 0;
        for(int i=0; i<n; i++) {
            altitude = altitude + nums[i];
            if(altitude > maxAltitude) {
                maxAltitude = altitude;
            }
        }
        System.out.println(maxAltitude);
        sc.close();
    }
    
}
