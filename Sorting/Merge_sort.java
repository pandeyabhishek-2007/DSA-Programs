//Merge Sorting//
import java.util.Arrays;  //to print merge array
public class Merge_sort {
    public static void main(String args[]) {
        int arr[] = {5, 4, 3, 2, 1};
        divide(arr, 0, arr.length - 1);

        // print sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        // sort left half
        divide(arr, si, mid);

        // sort right half
        divide(arr, mid + 1, ei);

        // merge them
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        // step 1: sizes of two halves
        int n1 = mid - si + 1;
        int n2 = ei - mid;

        // step 2: create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // step 3: copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[si + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        // step 4: merge temp arrays back into arr[si..ei]
        int i = 0, j = 0, k = si;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // step 5: copy remaining elements (if any)
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}

