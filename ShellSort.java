public class ShellSort
{
    public static void sort(int[] arr) {
        int length = arr.length;

        // Start with a large gap, then reduce the gap
        for (int gap = length / 2; gap > 0; gap /= 2) {
            // Perform a gapped insertion sort for this gap size
            for (int i = gap; i < length; i++) {
                int temp = arr[i];
                int j;
                // Shift sorted elements until correct location for arr[i] is found
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }

                // Put temp in its correct location
                arr[j] = temp;
            }
        }
    }
    //blackboard resource used 
    public boolean validate(int[] arr) 
     {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) return false;
        }
        return true;
    }
}
