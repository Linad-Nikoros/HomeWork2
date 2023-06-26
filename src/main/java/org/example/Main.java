package org.example;
public class Main {
    public static void main(String[] args) {
    int[] array1 = {54, 5, 32, 20, 1, 0, 44, 29, 6, 8};
    heapSort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
    private static void heapSort(int[] array) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, i, n);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, 0, i);
        }
    }
    public static void heapify(int[] array, int i, int n) {
        int l = i * 2 + 1;
        int r = i * 2 + 2;
        int largest = i;

        if(l < n && array[l] > array[largest]) {
            largest = l;
        }
        if(r < n && array[r] > array[largest]) {
            largest = r;
        }
        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heapify(array, largest, n);
        }

    }
}