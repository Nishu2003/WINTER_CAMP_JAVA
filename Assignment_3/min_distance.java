import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class MinimumDistance {
    // Function to calculate the minimum distance
    static int minimumDistance(int[] array,int x,int y){
        int prev,i=0;
        prev = 0;
        int dist = Integer.MAX_VALUE;
        for(i=0; i<array.length; i++){
            if(array[i] == x || array[i] == y){
                prev  = i;
                break;
            }
        }
        for(i=prev+1; i<array.length; i++){
            if(array[i] == x || array[i] == y){
                if(array[i] != array[prev] && (i-prev) < dist)
                {
                    dist = i-prev;
                    prev = i;
                }
                else{
                    prev = i;
                }
            }
        }
        return dist;
    }
    // Function to read  input and display the output
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size;
        System.out.println("Enter the size of the array");
        try {
            size = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println("Invalid Input");
            return;
        }
        int[] array = new int[size];
        System.out.println("Enter array elements");
        int i;
        for (i = 0; i < array.length; i++) {
            try {
                array[i] = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.out.println("An error Occurred");
            }
        }
        int x,y;
        System.out.println("Enter the numbers between which" + 
                            " the distance is to be calculated");
        try {
            x = Integer.parseInt(br.readLine());
            y = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println("Invalid Input");
            return;
        }
        int output = minimumDistance(array,x,y);
        System.out.println("The minimum distance is " + output);
    }
}
