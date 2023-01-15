package Worksheet;
import java.util.Scanner;
public class subset {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("enter size: ");
            int n=sc.nextInt();
            int a[]=new int[n];
            System.out.print("enter elements  : ");
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }

            System.out.println("output : ");
            System.out.println("[ ]");
            for(int i=0;i<n;i++){
                System.out.print("[ ");
                for(int j=0;j<i+1;j++){
                    System.out.print(a[j]+" ");
                }
                System.out.print(" ]");
                System.out.println(" ");
            }
        }
    }
}
