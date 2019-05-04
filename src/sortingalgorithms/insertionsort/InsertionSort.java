package sortingalgorithms.insertionsort;

public class InsertionSort {

    public void sort(int[] array) {
        int value;
        int index;
        int arrayLength = array.length;
        for (int i = 1; i < arrayLength; i++) {
            value = array[i];
            index = i;
            while (index > 0 && array[index-1] > value) {
                array[index] = array[index - 1];
                index--;
            }
            array[index] = value;
        }
    }
}
