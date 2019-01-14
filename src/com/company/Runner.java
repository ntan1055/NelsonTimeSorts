package com.company;

public class Runner
{
    public static void main(String[] args)
    {
        System.out.println("Creating Random Int Array...");
        int[] testArr = randIntArr(1000000);
        System.out.println("Copying Array...");
        int[] bubbleSort = copyIntArray(testArr);
        long timeStart = 0;
        long timeStop = 0;

        System.out.println("Sorting using bubbleSort()");
        timeStart = System.nanoTime();
        InPlaceSorts.bubbleSort(bubbleSort);
        timeStop = System.nanoTime() - timeStart;

        System.out.println("Time for bubbleSort() :" + timeStop + " nanoseconds");
    }

    public static int[] randIntArr(int count)
    {
        int[] array = new int[count];
        for(int i = 0; i < count; i++)
        {
            array[i] = (int)(Math.random() * 10001);
        }
        return array;
    }

    public static int[] copyIntArray(int[] arr)
    {
        int[] copy = new int[arr.length];
        int j = 0;
        for(int i = 0; i < arr.length; i++)
        {
            copy[j] = arr[i];
            j = j + 1;
        }
        return copy;
    }

}
