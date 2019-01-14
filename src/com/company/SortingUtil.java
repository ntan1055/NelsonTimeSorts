package com.company;

public class SortingUtil
{
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

    public static void intSwap(int[] arr, int j, int temp)
    {
        temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
    }
}
