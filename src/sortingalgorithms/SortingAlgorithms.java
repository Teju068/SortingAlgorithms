
package sortingalgorithms;

import sortingalgorithms.insertionsort.InsertionSort;
import sortingalgorithms.selectionsort.SelectionSort;
import sortingalgorithms.bubblesort.BubbleSort;
import sortingalgorithms.mergesort.MergeSortAlgorithm;
import sortingalgorithms.quicksort.QuickSortAlgorithm;

import java.util.Scanner;

import static sortingalgorithms.Logger.log;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int[] array = new int[]{3, 1, 2, 4, 5, 8, 6, 9, 7, 12, 10, 11, 12};
        log("Enter algorithms which you want to use for sorting");
        Scanner scanner = new Scanner(System.in);
        log("1 for Merge Sort");
        log("2 for Quick Sort");
        log("3 for Bubble Sort");
        log("4 for Selection Sort");
        log("5 for Insertion Sort");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                log("Sorted using Merge sort");
                MergeSortAlgorithm mergeSortAlgorithm = new MergeSortAlgorithm();
                mergeSortAlgorithm.sort(array);
                log(array);
                break;
            case 2:
                log("Sorted using Quick sort");
                QuickSortAlgorithm quickSortAlgorithm = new QuickSortAlgorithm();
                quickSortAlgorithm.sort(array);
                log(array);
                break;
            case 3:
                log("Sorted using Bubble sort");
                BubbleSort bubbleSort = new BubbleSort();
                bubbleSort.sort(array);
                log(array);
                break;
            case 4:
                log("Sorted using Selection sort");
                SelectionSort selectionSort = new SelectionSort();
                selectionSort.sort(array);
                log(array);
                break;
            case 5:
                log("Sorted using Insertion Sort");
                InsertionSort insertionSort = new InsertionSort();
                insertionSort.sort(array);
                log(array);
                break;
        }
    }
}
