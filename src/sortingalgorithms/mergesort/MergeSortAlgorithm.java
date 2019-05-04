package sortingalgorithms.mergesort;

public class MergeSortAlgorithm {

    public void sort(int[] array) {

        int completeArrayLength = array.length;
        if (completeArrayLength < 2)
            return;

        int mid = completeArrayLength / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[completeArrayLength - mid];

        for (int i = 0; i < mid; i++) {
            leftArray[i] = array[i];
        }

        for (int j = mid; j < completeArrayLength; j++) {
            rightArray[j - mid] = array[j];
        }
        sort(leftArray);
        sort(rightArray);
        merge(leftArray, rightArray, array);

    }

    private void merge(int[] leftArray, int[] rightArray, int[] completeArray) {
        int leftArrayLength = leftArray.length;
        int rightArrayLength = rightArray.length;
        int i = 0, j = 0, k = 0;
        while (i < leftArrayLength && j < rightArrayLength) {
            if (leftArray[i] <= rightArray[j]) {
                completeArray[k] = leftArray[i];
                i++;
            } else {
                completeArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftArrayLength) {
            completeArray[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightArrayLength) {
            completeArray[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
