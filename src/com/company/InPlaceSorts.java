package com.company;

public class InPlaceSorts extends SortingUtil
{
    public static void bubbleSort(int[] arr)
    {
        int i;
        int j;
        boolean swap = true;
        while(swap)
        {
            swap = false;
            for(j = 1; j < arr.length; j++)
            {
                i = j - 1;
                if(arr[j] < arr[i])
                {
                    int x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                    swap = true;
                }
            }
        }
    }

    public static void selectionSort(int[] arr)
    {
        int min;
        for(int i = 0; i < arr.length; i++)
        {
            min = i;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }
            if(min != i)
            {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    public static void insertionSort(int[] arr)
    {
        int sub = 0;
        for(int i = 1; i < arr.length; i++)
        {
            for(int j = i; j > 0; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    intSwap(arr, j, sub);
                }
            }
        }
    }
}