public class quick_sort {

    public static void quickSort(int[] A, int low, int high) {
        int pivot = 0;

        while(low < high) {
            pivot = Partition(A, low, high);
            quickSort(A, low, pivot-1);
            quickSort(A, pivot+1, high);
        }
    }

    public static int Partition(int[] A, int low, int high) {
        int pivotValue = A[low];
        int left = low+1;
        int right = high;

        while(left < right) {
            while(A[left] < pivotValue) {
                left++;
            }
            while(A[right] > pivotValue) {
                right--;
            }
        }
        A[low] = A[right];
        A[right] = pivotValue;
        return right;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 4, 2, 1, 7, 9, 8};
        quickSort(arr, 0, arr.length);

        for(var i : arr) { 
            System.out.print(i+" ");
        }
    }
}