package Assignment2;

class test{
    private static test single_instance = null;
    private test(){
        System.out.println("Test Constructor ... ");
    }
    public static test print(){
        System.out.println("test method");
        return single_instance;
    }
}
public class singelton_class {
    public static void main(String[] args) {

        /*test obj2=new test();
        obj2.print();*/
        /*ERROR */
        test x=test.print();
    }
}
