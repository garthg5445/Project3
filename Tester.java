import java.util.Random;

public class Tester
{
    public static void main(String[] args)
    {
        SelectionSort s1 = new SelectionSort();
        InsertionSort s2 = new InsertionSort();
        BubbleSort s3 = new BubbleSort();
        MergeSort s4 = new MergeSort();
        ShellSort s5 = new ShellSort();
        QuickSort s6 = new QuickSort();
        HeapSort s7 = new HeapSort();
        //current max 17193
        int[] arr1 = generateRandomArray(17000);
        System.out.println("array sorting with 17000 elements");
        long startTime, endTime;

        startTime = System.nanoTime();
        s1.sort(arr1);
        endTime = System.nanoTime();
        System.out.println("SelectionSort took " + (endTime - startTime) / 1_000_000.0 + " ms");

        startTime = System.nanoTime();
        s2.sort(arr1);
        endTime = System.nanoTime();
        System.out.println("InsertionSort took " + (endTime - startTime) / 1_000_000.0 + " ms");

        startTime = System.nanoTime();
        s3.sort(arr1);
        endTime = System.nanoTime();
        System.out.println("BubbleSort took " + (endTime - startTime) / 1_000_000.0 + " ms");

        startTime = System.nanoTime();
        s4.sort(arr1, 0, arr1.length - 1);
        endTime = System.nanoTime();
        System.out.println("MergeSort took " + (endTime - startTime) / 1_000_000.0 + " ms");

        startTime = System.nanoTime();
        s5.sort(arr1);
        endTime = System.nanoTime();
        System.out.println("ShellSort took " + (endTime - startTime) / 1_000_000.0 + " ms");

        startTime = System.nanoTime();
        s6.sort(arr1, 0, arr1.length - 1);
        endTime = System.nanoTime();
        System.out.println("QuickSort took " + (endTime - startTime) / 1_000_000.0 + " ms");

        startTime = System.nanoTime();
        s7.sort(arr1);
        endTime = System.nanoTime();
        System.out.println("HeapSort took " + (endTime - startTime) / 1_000_000.0 + " ms");
        System.out.println("======================");
        
        /*
        System.out.println(s1.validate(arr1));
        System.out.println(s2.validate(arr2));
        System.out.println(s3.validate(arr3));
        System.out.println(s4.validate(arr4));
        System.out.println(s5.validate(arr5));
        System.out.println(s6.validate(arr6));
        System.out.println(s7.validate(arr7));
        
        int[] arr11 = generateRandomArray(10000);
        int[] arr22 = generateRandomArray(10000);
        int[] arr33 = generateRandomArray(10000);
        int[] arr44 = generateRandomArray(10000);
        int[] arr55 = generateRandomArray(10000);
        int[] arr66 = generateRandomArray(10000);
        int[] arr77 = generateRandomArray(10000);
        
        System.out.println(s1.validate(arr11));
        System.out.println(s2.validate(arr22));
        System.out.println(s3.validate(arr33));
        System.out.println(s4.validate(arr44));
        System.out.println(s5.validate(arr55));
        System.out.println(s6.validate(arr66));
        System.out.println(s7.validate(arr77));
        */
    }
    
     public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100000); // Random numbers between 0 and 99999
        }
        return arr;
    }
}