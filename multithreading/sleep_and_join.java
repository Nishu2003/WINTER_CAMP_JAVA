package Assignment4;
public class sleep_and_join implements Runnable
{
    Thread t3;
    public void run()
    {
        for(int i=0;i<5;++i)
        {
            try
            {
                System.out.println(i);
                Thread.sleep(2000);
            }
            catch(Exception e)
            {
                System.out.println("Exception caught");
            }
        }
    }
    public static void main(String args[])
    {
        sleep_and_join s = new sleep_and_join();
        sleep_and_join s2 = new sleep_and_join();
        Thread t = new Thread(s);
        Thread t2 = new Thread(s2);
        t.start();
        t2.start();
    }
}
