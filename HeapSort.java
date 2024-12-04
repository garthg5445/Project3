public class HeapSort
{
    public void sort(int[] arr)
    {
        int length = arr.length;

        //Build a max heap
        for (int i = length / 2 - 1; i >= 0; i--) {
            heap(arr, length, i);
        }

        //Extract elements from the heap one by one
        for (int i = length - 1; i > 0; i--) {
            //Move the current root/largest to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            
            heap(arr, i, 0);
        }
    }

    //Maintains the max heap property
    private static void heap(int[] arr, int n, int i) {
        int largest = i; 
        int left = 2 * i + 1; 
        int right = 2 * i + 2; 

        //If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        //If right child is larger than current largest
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        //If largest is not the root
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            //Recursively heap the sub-tree
            heap(arr, n, largest);
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