package Assignment_3;
import java.util.Scanner;

abstract class sort{
    abstract void sort_array(int k,int []a,int n);
}

class second extends sort{
    void sort_array(int k,int []a,int n){
        if(k>0){
            while(k!=0){
                int temp=a[n-1];
                for(int i=0;i<n-1;i++){
                    a[n-i-1]=a[n-i-2];
                }
                a[0]=temp;
            k--;
        }
    }
    if(k<0){
        while(k!=0){
            int temp=a[0];
            for(int i=0;i<n-1;i++){
                a[i]=a[i+1];
            }
            a[n-1]=temp;
        k++;
    }
    }
    if(k==0){
        print(k, a, n);
    }
    }

    void print(int k,int []a,int n){
        System.out.println("Rotated array : ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"  ");
        }
    }
}


public class rotate_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of array elements : ");
        int n=sc.nextInt();
        

        System.out.println("Enter array elements : ");
        int []a=new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.print("Enter the number of rotations that you want to perform on array : ");
        int k=sc.nextInt();

        second obj=new second();
        obj.sort_array(k, a, n);
    }
}
