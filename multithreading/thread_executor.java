import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
import java.util.concurrent.TimeUnit;  
  
public class ExecutorsnewSingleThreadExecutorExample2   {  
  
   public static void main(final String[] arguments) throws InterruptedException {  
      ExecutorService ex = Executors.newSingleThreadExecutor();  
  
      try {  
         ex.submit(new myThread5());  
         System.out.println("Shutingdown executor");  
         ex.shutdown();  
         ex.awaitTermination(10, TimeUnit.SECONDS);  
      } catch (InterruptedException e) {  
         System.err.println(e);  
      } finally {  
  
         if (!ex.isTerminated()) {  
            System.err.println("cancel  tasks");  
         }  
         ex.shutdownNow();  
         System.out.println(" finished");  
      }  
   }  
  
   static class myThread5 implements Runnable {  
        
      public void run() {  
  
         try {  
            Long duration = (long) (Math.random() * 90);  
            System.out.println("Running Task!");  
            TimeUnit.SECONDS.sleep(duration);  
         } catch (InterruptedException e) {  
            e.printStackTrace();  
         }  
      }  
   }  
}  
