package sortingalgorithms.bubblesort;

public class BubbleSort {

    public void sort(int[] array) {
        int arrayLength = array.length;
        int temp;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
