class QuickSort {
    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    static void doSort(int [] arr, int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = Partition.doPartition(arr, low, high);
  
            // Recursively sort elements before
            // partition and after partition
            doSort(arr, low, pi-1);
            doSort(arr, pi+1, high);
        }
    }
}