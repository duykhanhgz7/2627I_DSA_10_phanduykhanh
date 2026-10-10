import edu.princeton.cs.algs4.*;

public class SelectionSort {
    public void sort(int[] array) {
        for (int i = 0; i < array.length -1; i++) {
            int temp = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < temp) {
                    temp = array[j];
                    index = j;
                }
            }
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
void main(String[] args) {
    In in = new In("1Kints.txt"); // tạo luồng đọc từ file
    int[] a = in.readAllInts();  // đọc toàn bộ file vào mảng a
    long start = System.currentTimeMillis();
    SelectionSort s = new SelectionSort();
    s.sort(a);
    long end = System.currentTimeMillis();  // thời gian chạy bằng end - start
    StdArrayIO.print(a); // in mảng ra màn hình
}


