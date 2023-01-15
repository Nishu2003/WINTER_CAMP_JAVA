package Worksheet;
import java.util.Scanner;
import java.util.Arrays;
public class k_largest {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("enter size: ");
            int n=sc.nextInt();
            int a[]=new int[n];
            System.out.print("enter elements  : ");
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }

            Arrays.sort(a);

            System.out.println("enter smiths marks : ");
            int marks=sc.nextInt();
            
            for(int i=n-1;i>=0;i--){
                if(a[i]==marks){
                    System.out.print("OUTPUT : ");
                    System.out.println(n-i);
                    System.exit(0);
                }
            }

        }
    }
}
