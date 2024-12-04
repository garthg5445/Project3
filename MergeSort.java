public class MergeSort
{
    public void sort(int[] arr, int left, int right) 
    {
        if (left >= right) 
        {
            return; // Base case: single element or empty array
        }
        int mid = left + (right - left) / 2;
        // Recursively sort the two halves
        sort(arr, left, mid);
        sort(arr, mid + 1, right);

        // Merge the two halves
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            temp[k++] = (arr[i] <= arr[j]) ? arr[i++] : arr[j++];
        }
        while (i <= mid)
        {
            temp[k++] = arr[i++];   
        }
        while (j <= right)
        {
            temp[k++] = arr[j++];    
        }

        // Copy the merged array back into the original array
        System.arraycopy(temp, 0, arr, left, temp.length);
    }
    //I TOOK THIS OFF THE INTERNET, COULDNT FIGURE IT OUT geeks4geeks
    public boolean validate(int[] arr) 
     {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) return false;
        }
        return true;
    }
}