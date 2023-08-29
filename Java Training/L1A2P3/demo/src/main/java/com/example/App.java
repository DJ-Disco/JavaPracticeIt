package com.example;

public class App 
{
    public static void main( String[] args )
    {
        int[] arr = {22,43,86,71,66,69,69,63,87,3};
        System.out.println("Values in array before doubling:");
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
        doubleArray(arr);
        System.out.println("\n\nValues in array after doubling:");
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void doubleArray(int[]arr) {
        for(int i=0;i<10;i++){
            arr[i] *= 2;
        }
    }
}
