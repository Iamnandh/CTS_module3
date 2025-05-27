public class VirtualThreadsExample {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> System.out.println("Running in virtual thread: " + Thread.currentThread());

        // Launch 100,000 virtual threads
        for (int i = 0; i < 100_000; i++) {
            Thread.startVirtualThread(task);
        }

        // Sleep briefly to allow all threads to run
        Thread.sleep(2000);
    }
}