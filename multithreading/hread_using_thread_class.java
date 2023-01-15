package Assignment4;

class one extends Thread{
    public void run(){
        System.out.println("Thread is running !!! ...");
    }
}
public class thread_using_thread_class {
    public static void main(String[] args) {
        one obj=new one();
        obj.start();

        one obj2=new one ();
        obj2.start();

        one obj3=new one();
        obj3.start();
    }
}
