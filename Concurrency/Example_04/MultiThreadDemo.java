public class MultiThreadDemo {
    public static void main(String[] args) 
    {
        new NewThread("Thread One"); // start threads
        new NewThread("Thread Two");
        new NewThread("Thread Three");
        try 
        {
            // wait for other threads to end
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}