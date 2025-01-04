public class CounterTask implements Runnable {
    private String taskName;

    public CounterTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " - Count: " + i);
            try {
                // Simulate some work with sleep
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(taskName + " interrupted.");
            }
        }
        System.out.println(taskName + " completed.");
    }
}

public class ConcurrencyDemo {
    public static void main(String[] args) {
        System.out.println("Main thread starting...");

        // Create and start threads
        Thread thread1 = new Thread(new CounterTask("Task 1"));
        Thread thread2 = new Thread(new CounterTask("Task 2"));
        Thread thread3 = new Thread(new CounterTask("Task 3"));

        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("All tasks completed. Main thread exiting.");
    }
}
