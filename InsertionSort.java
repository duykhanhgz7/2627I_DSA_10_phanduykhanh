import edu.princeton.cs.algs4.*;
import java.nio.file.Paths;

public class InsertionSort {
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
void main(String[] args) {
    In in = new In("1Kints.txt"); // tạo luồng đọc từ file
    int[] a = in.readAllInts();  // đọc toàn bộ file vào mảng a
    long start = System.currentTimeMillis();
    InsertionSort is = new InsertionSort();
    is.sort(a);
    long end = System.currentTimeMillis();  // thời gian chạy bằng end - start
    StdArrayIO.print(a); // in mảng ra màn hình
}


