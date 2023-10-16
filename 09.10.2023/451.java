class Solution {
    public String frequencySort(String s) {
        int a[][] = new int[128][2];
        for (char ch : s.toCharArray()) {
            a[ch][0] = ch;
            a[ch][1]++;
        }
        quickSort(a, 0, 127);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 128; i++) {
            if (a[i][1] == 0) break;
            for (int j = 0; j < a[i][1]; j++) {
                sb.append((char) a[i][0]);
            }
        }
        return sb.toString();
    }

    private void quickSort(int[][] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(int[][] arr, int low, int high) {
        int pivot = arr[high][1];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j][1] > pivot || (arr[j][1] == pivot && arr[j][0] < arr[high][0])) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private void swap(int[][] arr, int i, int j) {
        int[] temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
