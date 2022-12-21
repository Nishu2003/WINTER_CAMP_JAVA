package Assignment_1;
import java.util.Scanner;
public class object_cloning_using_copy_constructor {
    String UID;
    String name;
    
    object_cloning_using_copy_constructor(String UID, String name){
        this.UID=UID;
        this.name=name;
    }

    object_cloning_using_copy_constructor(object_cloning_using_copy_constructor s){
        UID=s.UID;
        name=s.name;
    }


    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
                System.out.println("Enter your UID :");
                String uid=sc.next();
                System.out.println("Enter your name : ");
                String name=sc.next();

                object_cloning_using_copy_constructor obj1=new object_cloning_using_copy_constructor(uid,name);

                object_cloning_using_copy_constructor obj2=new object_cloning_using_copy_constructor(obj1);

                System.out.println(obj1.UID+"   "+obj1.name);
                System.out.println(obj2.UID+"   "+obj2.name);
        }
    }
}
