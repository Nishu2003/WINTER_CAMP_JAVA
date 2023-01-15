package Worksheet;

import java.util.Scanner;

public class max_profit {
    public static void main(String[] args) {
        try(Scanner  sc=new Scanner(System.in)){
            System.out.print("enter size: ");
            int n=sc.nextInt();
            int a[]=new int[n];
            System.out.print("enter elements  : ");
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }

            int min=a[0];
            int max=0;
            int p=0;
            for(int i=0;i<n;i++){
                if(a[i]<min){
                    min=a[i];
                    p=i;
                }
            }
            for(int i=p;i<n;i++){
                if(a[i]>max){
                    max=a[i];
                }
            }

            System.out.println("output:  "+(max-min));

        }
    }
}
