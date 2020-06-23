package exercises.permutation.src;

public class PermutationDemo {

    public static void printPermutn(int[] arr, int index)
    {

        int size = arr.length;

        if (size == index + 1) {
            for (int value : arr) {

                System.out.print(value);
            }
            System.out.println();
        } else {
            for (int i = index; i < size; i++) {

                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                printPermutn(arr, index + 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        printPermutn(arr, 0);
    }
}
