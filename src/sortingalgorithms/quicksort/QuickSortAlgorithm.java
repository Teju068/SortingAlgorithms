package sortingalgorithms.quicksort;

public class QuickSortAlgorithm {

    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }


    private void quickSort(int[] array, int startIndex, int endIndex) {
        int pivotIndex;
        if (startIndex < endIndex) {
            pivotIndex = partition(array, startIndex, endIndex);
            quickSort(array, startIndex, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, endIndex);
        }
    }

    private int partition(int[] array, int startIndex, int endIndex) {
        int pivot = array[endIndex];
        int partitionIndex = startIndex;

        int temp;

        for (int i = startIndex; i < endIndex; i++) {
            if (array[i] <= pivot) {
                temp = array[i];
                array[i] = array[partitionIndex];
                array[partitionIndex] = temp;
                partitionIndex = partitionIndex + 1;
            }
        }

        temp = array[partitionIndex];
        array[partitionIndex] = array[endIndex];
        array[endIndex] = temp;

        return partitionIndex;

    }
}
