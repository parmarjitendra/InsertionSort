import java.util.Arrays;

public class MyInsertionSortMain {
    public static void main(String[] args) {
        int[] arr = {25, 2, 8, 60, 3};
        System.out.println("Unsorted-->" + Arrays.toString(arr));
        MyInsertionSort object = new MyInsertionSort();
        object.insertionSort(arr);
        System.out.println("sorted-->" + Arrays.toString(arr));
    }
}