class Solution {
    
    static int inversionCount(int arr[]) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    static int mergeSort(int[] arr, int l, int h) {
        int count = 0;

        if (l < h) {
            int m = l + (h - l) / 2;

            count += mergeSort(arr, l, m);
            count += mergeSort(arr, m + 1, h);
            count += merge(arr, l, m, h);
        }

        return count;
    }

    static int merge(int[] arr, int l, int m, int h) {
        int count = 0;

        int i = l;
        int j = m + 1;
        int k = 0;

        int[] temp = new int[h - l + 1];

        while (i <= m && j <= h) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                count += (m - i + 1);   
                temp[k++] = arr[j++];
            }
        }

        while (i <= m) {
            temp[k++] = arr[i++];
        }

        while (j <= h) {
            temp[k++] = arr[j++];
        }

        for (int p = 0; p < temp.length; p++) {
            arr[l + p] = temp[p];
        }

        return count;
    }
}
