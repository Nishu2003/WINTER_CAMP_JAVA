package Assignment_3;
import java.util.Scanner;
class sort{
    protected void sort1(int []a,int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
}
class sorting extends sort{
    void print(int []a,int n){
        sort1(a,n);
        System.out.println("Sorted array is  : ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"  ");
        }
    }
}

public class sort_0_1 {
    public static void main(String[] args) {
        /***************************** */
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enetr the number of elements of an array : ");
            int n=sc.nextInt();

            System.out.println("Enter array elements : ");
            int a[]=new int [n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }

            sorting obj=new sorting();
            obj.print(a,n);
        }
    }
}

