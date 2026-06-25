package SafeRoad;

import java.util.Arrays;

public class GreedyDP {

    // Activity Selection
    public static void activitySelection(int[] start, int[] finish) {

        int n = start.length;

        System.out.println("Selected Patrol Activities:");

        int i = 0;
        System.out.println(i);

        for (int j = 1; j < n; j++) {

            if (start[j] >= finish[i]) {
                System.out.println(j);
                i = j;
            }
        }
    }
    // 0/1 Knapsack
    public static int knapsack(int W, int wt[], int val[], int n) {

        int[][] K = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {

            for (int w = 0; w <= W; w++) {

                if (i == 0 || w == 0)
                    K[i][w] = 0;

                else if (wt[i - 1] <= w)
                    K[i][w] = Math.max(
                            val[i - 1] + K[i - 1][w - wt[i - 1]],
                            K[i - 1][w]
                    );

                else
                	  K[i][w] = K[i - 1][w];
            }
        }

        return K[n][W];
    }

    // Longest Increasing Subsequence
    public static int LIS(int[] arr) {

        int n = arr.length;
        int[] lis = new int[n];

        Arrays.fill(lis, 1);

        for (int i = 1; i < n; i++) {

            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;
            }
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            if (max < lis[i])
                max = lis[i];
        }

        return max;
    }
}