public class SelectionSort
{
    public static void sort(int[] arr) {
        int length = arr.length;
        // Loop that goes through each element 
        for (int i = 0; i < length - 1; i++) {
            // Find the min element
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the min element with first element of unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
     public boolean validate(int[] arr) 
     {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) return false;
        }
        return true;
    }
}