public class BubbleSort
{
    public void sort(int[] arr)
    {
        int length = arr.length;
        
        for (int i = 0; i < length - 1; i++) {
            //loop for comparing adjacent elements
            for (int j = 0; j < length - i - 1; j++) {
                //swap if the current element is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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