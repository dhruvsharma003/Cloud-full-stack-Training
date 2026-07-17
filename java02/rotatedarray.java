package java02;

public class rotatedarray {
    int[] rotate(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return arr;
        }

        int n = arr.length;
        k = k % n;

        if (k < 0) {
            k += n;
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        rotatedarray obj = new rotatedarray();
        int[] arr = {1, 2, 3, 4, 5};
        int[] rotated = obj.rotate(arr, 2);

        for (int num : rotated) {
            System.out.print(num + " ");
        }
    }
}
