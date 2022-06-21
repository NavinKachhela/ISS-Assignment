import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class ThreadPool {
  public static void main(String[] args) {

    //fixed no of threads are created if additional tasks are submitted they are queued
    ThreadPoolExecutor fixedThreadExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);

    //creates new threads as needed, improve the performance of programs      
    ThreadPoolExecutor cachedThreadExecutor = (ThreadPoolExecutor) Executors.newCachedThreadPool();

    System.out.println("newCachedThreadPool");
    System.out.println("Largest executions : " + cachedThreadExecutor.getLargestPoolSize());
    System.out.println("Maximum allowed threads: " + cachedThreadExecutor.getMaximumPoolSize());
    System.out.println("Current threads in pool: " + cachedThreadExecutor.getPoolSize());
    System.out.println("Currently executing threads: " + cachedThreadExecutor.getActiveCount());
    System.out.println("Total number of threads scheduled: " + cachedThreadExecutor.getTaskCount());

    System.out.println("\nnewFixedThreadPool");
    System.out.println("Largest executions : " + fixedThreadExecutor.getLargestPoolSize());
    System.out.println("Maximum allowed threads: " + fixedThreadExecutor.getMaximumPoolSize());
    System.out.println("Current threads in pool: " + fixedThreadExecutor.getPoolSize());
    System.out.println("Currently executing threads: " + fixedThreadExecutor.getActiveCount());
    System.out.println("Total number of threads scheduled: " + fixedThreadExecutor.getTaskCount());

    cachedThreadExecutor.submit(new Task());
    cachedThreadExecutor.submit(new Task());
    cachedThreadExecutor.submit(new Task());

    System.out.println("\nnewCachedThreadPool");
    System.out.println("Largest executions : " + cachedThreadExecutor.getLargestPoolSize());
    System.out.println("Maximum allowed threads: " + cachedThreadExecutor.getMaximumPoolSize());
    System.out.println("Current threads in pool: " + cachedThreadExecutor.getPoolSize());
    System.out.println("Currently executing threads: " + cachedThreadExecutor.getActiveCount());
    System.out.println("Total number of threads scheduled: " + cachedThreadExecutor.getTaskCount());

    cachedThreadExecutor.shutdown();
  }

  static class Task implements Runnable {

    public void run() {

      try {
        Long duration = (long)(Math.random() * 5);
        System.out.println("\nRunning Task! Thread Name: " +
          Thread.currentThread().getName());
        Thread.sleep(duration);
        System.out.println("Task Completed! Thread Name: " +
          Thread.currentThread().getName());
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

}