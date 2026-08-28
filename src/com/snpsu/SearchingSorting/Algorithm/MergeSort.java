package com.snpsu.SearchingSorting.Algorithm;

public class MergeSort {
    static void merge(int[] arr, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = 0;

        int[] temp = new int[right - left + 1];
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (i = left; i <= right; i++) {
            arr[i] = temp[i - left];
        }
    }
    static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            merge(arr, left, mid, right);
            }
        }
        public static void main(String[] args) {
        int[] arr = {38, 12, 27, 43, 9, 31, 18};
        sort(arr, 0, arr.length - 1);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

