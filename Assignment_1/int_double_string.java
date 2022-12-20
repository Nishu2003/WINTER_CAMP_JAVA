import java.util.Scanner;
public class int_double_string {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try (Scanner sm = new Scanner(System.in)) {
                System.out.println("Enter integer : ");
                int a=sc.nextInt();
                System.out.println("Enter double : ");
                double b=sc.nextDouble();
                System.out.println("Enter string: ");
                String c=sm.nextLine();

                System.out.println("String: "+c);
                System.out.println("DOuble: "+b);
                System.out.println("Integer: "+a);
            }
        }
    }
}
