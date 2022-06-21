class VolatileMain extends Thread{
    // volatile keyword makes sure that the changes made in one thread are reflected in other thread
    // Volatile keyword guarantees that your variable will not be cached
    volatile boolean keepRunning = true;

    public void run() {
        long count=0;
        while (keepRunning) {
            count++;
        }

        System.out.println("Thread terminated." + count);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileMain thread1 = new VolatileMain();
        thread1.start();

        Thread.sleep(1000);
        System.out.println("after sleeping in main");
        thread1.keepRunning = false;
        thread1.join();
        System.out.println("keepRunning set to " + thread1.keepRunning);
    }
}