package Algorithm;

import java.util.Scanner;

public class DataSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n+1];

        for (int i = 1; i <= n; i++) {
            nums[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int idx = -1;
        for (int i = 1; i <= n; i++) {
            if (x == nums[i]){
                idx = i;
            }
        }
        System.out.println(idx);
    }
}
