package main.arraystring;

public class SeparateZeroOne {

    public static void separate(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // move left until 1 found
            while (arr[left] == 0 && left < right) {
                left++;
            }

            // move right until 0 found
            while (arr[right] == 1 && left < right) {
                right--;
            }

            // swap
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 0, 0, 1};

        separate(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
