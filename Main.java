class Main {
    static void printArray(int [] arr) {
        int n = arr.length - 1;

        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println(arr[n]);
    }

    public static void main(String [] args) {
        int [] arr = {1, 2, 3, 50, 45, 40, 20, 25, 35, 30, 28};

        QuickSort.doSort(arr, 0, arr.length-1);

        System.out.print("Sorted array is: ");
        printArray(arr);
    }
}