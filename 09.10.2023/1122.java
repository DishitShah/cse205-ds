import java.util.*;
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int curr = 0;
        for (int j = 0; j < arr2.length; j++) {

            for (int i = curr; i < arr1.length; i++) {

                if (arr1[i] == arr2[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[curr];
                    arr1[curr] = temp;
                    curr++;
                }
            }
        }
        sort(arr1, curr, arr1.length - 1);
        return arr1;
    }

    static void sort(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int l = low;
        int h = high;
        int r = (h - l) / 2 + l;
        int pivot = arr[r];

        while (l <= h) {
            while (arr[l] < pivot)
                l++;
            while (arr[h] > pivot)
                h--;
            if (l <= h) {
                int temp = arr[l];
                arr[l] = arr[h];
                arr[h] = temp;
                l++;
                h--;
            }
        }

        sort(arr, low, h);
        sort(arr, l, high);
    }
}
