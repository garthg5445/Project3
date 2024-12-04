public class InsertionSort
{
    public void sort(int[] arr)
    {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int key = arr[i]; //element to be inserted
            int j = i - 1;
            //shift elements of the sorted portion
            while (j >= 0 && arr[j] > key) 
            {
                arr[j + 1] = arr[j];
                j--;
            }
            //insert the key
            arr[j + 1] = key;
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
