public class QuickSort
{
    public static void sort(int[] arr, int low, int high) 
    {
        if (low < high) {
            // Partition the array around a pivot and get the pivot index
            int part = partition(arr, low, high);

            // sort using recursion before and after partition
            sort(arr, low, part - 1);
            sort(arr, part + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; //last element == the pivot
        int i = low - 1;//Ind. of the smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //Place the pivot element in its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; //Return pivot index
    }
    //Geeks for geeks and baeldung used 
    public boolean validate(int[] arr) 
     {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) return false;
        }
        return true;
    }
}