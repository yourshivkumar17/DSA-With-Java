import java.util.*;

public class FindTheDifferenceOfTwoArray{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];

        for(int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];

        for(int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        for(int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(Integer num : set1) {
            if(!set2.contains(num)) {
                list1.add(num);
            }
        }

        for(Integer num : set2) {
            if(!set1.contains(num)) {
                list2.add(num);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(list1);
        result.add(list2);

        System.out.println(result);

        sc.close();
    }
}