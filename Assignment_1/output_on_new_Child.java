package Assignment_1;

class Parent extends Grandparent{
    {
        System.out.println("instance :parent");
    }
    public Parent(){
        System.out.println("cosntructor-parent");
    }
    static{
        System.out.println("static - parent");
    }
}

class Grandparent{
    static{
        System.out.println("static - grandparent");
    }
    {
        System.out.println("inatance - grandparent");
    }
    public Grandparent(){
        System.out.println("contructur - grandparent");
    }
}

class child extends Parent{
    public child(){
        System.out.println("Constructor - child");
    }
    static{
        System.out.println("static - child");
    }
    {
        System.out.println("inatance - child");
    }
}
public class output_on_new_Child{
    public static void main(String[] args) {
        child obj=new child();
    }
}
