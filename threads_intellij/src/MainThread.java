public class MainThread {
    public static void main (String [] args)
    {
        System.out.println("This is the main thread");
        SubThread subThread = new SubThread();
        subThread.start();
        System.out.println("This is the main thread again");
    }
}
