package Assignment_1;
import java.util.Scanner;

public class object_cloning_using_cloneable implements Cloneable{

    String UID;
    String name;

    object_cloning_using_cloneable(String  UID,String name){
        this.UID=UID;
        this.name=name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            try{
                System.out.println("Enter your UID :");
                String uid=sc.next();
                System.out.println("Enter your name : ");
                String name=sc.next();

                object_cloning_using_cloneable obj1=new object_cloning_using_cloneable(uid,name);

                object_cloning_using_cloneable obj2=(object_cloning_using_cloneable)obj1.clone();

                System.out.println(obj1.UID+"   "+obj1.name);
                System.out.println(obj2.UID+"   "+obj2.name);

            }
            catch(CloneNotSupportedException e){}
        }
    }
}
