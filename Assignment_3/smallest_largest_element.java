package Assignment_3;
import java.util.Scanner;
class smallest{
    private int small_value=1000;
    private int large_value;
    protected int small(int a[],int n){
        for(int i=0;i<n;i++){
            if(a[i]<small_value){
                small_value=a[i];
            }
        }
        return small_value;
    }
    protected int largest(int a[],int n){
        for(int i=0;i<n;i++){
            if(a[i]>large_value){
                large_value=a[i];
            }
        }
        return large_value;
    }
}
class print extends smallest{
    void printing(int []a,int n){
        System.out.println(small(a,n));
        System.out.println(largest(a,n));
    }
}
public class smallest_largest_element {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        System.out.print("Enter the number of array elements : ");
        int n=sc.nextInt();
        int a[]=new int[n];

        System.out.println("Enter array elements : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        print obj=new print();
        obj.printing(a,n);
    }
    }
}
