package KunalDsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindKthRotation {

    static int findPivot(List<Integer> nums, int n) {
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums.get(mid) > nums.get(mid + 1)) {
                return mid;
            }
            if (mid > start && nums.get(mid) < nums.get(mid - 1)) {
                return mid - 1;
            }

            if (nums.get(mid) <= nums.get(start)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }

        int pivotIndex = findPivot(nums, n);
        int kRotation = (pivotIndex + 1) % n;

        System.out.println(kRotation);
    }
}
