import java.util.*;
import java.io.*;
// function to print the array
class cycle {
    public int[] cycleShift(int[] arr)
    {
        int x = arr[0]; // store a[0]
        int i;
        for (i = 0; i < arr.length - 1; i++) {
           
            // for other element shift left
            arr[i] = arr[i + 1];
        }
        // for the last element in the modified array
        // it will be starting element
        arr[i] = x;
        return arr;
    }
}
public class GFG {
 
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 4, 5 };
        cycle c = new cycle();
        int[] newArray = c.cycleShift(arr);
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
