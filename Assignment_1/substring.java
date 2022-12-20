import java.util.Scanner;
public class substring {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string : ");
            String s=sc.nextLine();
            char[] a =s.toCharArray();

            System.out.println("Enter 2 integers : ");
            int x=sc.nextInt();
            int y=sc.nextInt();

            for(int i=x;i<y;i++){
                System.out.print(a[i]);
            }
        }
    }
}
