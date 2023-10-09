import java.util.*;
class Solution {
    public int heightChecker(int[] heights) {
        int cnt = 0;
        int[] ans = new int[heights.length];
        for(int i = 0; i < heights.length; i++){
            ans[i] = heights[i];
        }
        quickSort(heights, 0, heights.length - 1);
        for (int i = 0; i < heights.length; i++) {
            if (ans[i] != heights[i])
                cnt++;
        }
        return cnt;
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
