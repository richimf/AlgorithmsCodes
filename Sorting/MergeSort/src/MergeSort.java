
//The merge sort algorithm
public class MergeSort {

    public static void main(String args[]) {

        int[] array = {8, 1, 6, 33, 99, 3, 4, 5, 2, 93, 65};
        int output[] = mergeSort(array);
        int s = output.length;
    }

    //split array and merge
    static int[] mergeSort(int[] array) {

        //base case
        if (array.length <= 1) {
            return array;
        }

        //Split, divide
        int middleIndex = array.length / 2;
        int[] left = mergeSort(getArrayRange(0, middleIndex, array));
        int[] right = mergeSort(getArrayRange(middleIndex, array.length, array));

        //Merge, conquer
        return merge(left, right);
    }

    static int[] merge(int left[], int right[]) {

        int j = 0; //counter
        int leftIndex = 0;
        int rightIndex = 0;
        int size = left.length + right.length;
        int[] output = new int[size];

        while (leftIndex < left.length && rightIndex < right.length) {

            if (left[leftIndex] < right[rightIndex]) {
                output[j] = left[leftIndex];
                j++;
                leftIndex++;
            } else if (left[leftIndex] > right[rightIndex]) {
                output[j] = right[rightIndex];
                j++;
                rightIndex++;
            } else {
                //means there are two elements with the same value
                output[j] = left[leftIndex];
                j++;
                leftIndex++;
                output[j] = right[rightIndex];
                j++;
                rightIndex++;
            }
        }

        //add the missing element from the input array
        while (leftIndex < left.length) {
            output[j] = left[leftIndex];
            j++;
            leftIndex++;
        }
        while (rightIndex < right.length) {
            output[j] = right[rightIndex];
            j++;
            rightIndex++;
        }
        return output;
    }

    //get sub array from the range
    static int[] getArrayRange(int from, int to, int[] array) {

        int j = 0; //counter
        int size = to - from;
        int[] temp = new int[size]; //temporary array

        for (int i = from; i < to; i++) {
            temp[j] = array[i];
            j++;
        }
        return temp;
    }
}
