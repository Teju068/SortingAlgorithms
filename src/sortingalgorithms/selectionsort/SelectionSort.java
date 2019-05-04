package sortingalgorithms.selectionsort;

public class SelectionSort {

    public void sort(int[] array) {
        int minIndex;
        int temp;
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength - 1; i++) {
            minIndex = i;
            for (int j = i; j < arrayLength - 1; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
