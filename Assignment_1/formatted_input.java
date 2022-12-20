package Assignment_1;
import java.util.Scanner;
public class formatted_input {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("INPUT : ");
            String name=sc.next();
            int i=sc.nextInt();

            String name1=sc.next();
            int i1=sc.nextInt();

            String name2=sc.next();
            int i2=sc.nextInt();

            System.out.println("================================================================================");
            System.out.println(name+"               "+i);
            System.out.println(name1+"               "+i1);
            System.out.println(name2+"               "+i2);
            System.out.println("================================================================================");
            
        }
    }
}
