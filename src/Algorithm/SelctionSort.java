package Algorithm;

public class SelctionSort {
    public void sort(int[] data) {
        int size = data.length;
        int min;
        int temp;

        for (int i = 0; i < size - 1; i++) {
            min = i;
            for (int j = i + 1; j < size; j++) {
                if (data[min] > data[j]) {
                    min = j;
                }
            }
            temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        SelctionSort ss = new SelctionSort();
        ss.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
