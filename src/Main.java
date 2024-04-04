public class Main {
    public static void main(String[] args) {
        ThreadGroup mainGroup = new ThreadGroup("main group");
        Thread thread1 = new Thread(mainGroup, new MyThread(), "поток 1");
        Thread thread2 = new Thread(mainGroup, new MyThread(), "поток 2");
        Thread thread3 = new Thread(mainGroup, new MyThread(), "поток 3");
        Thread thread4 = new Thread(mainGroup, new MyThread(), "поток 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException ex) {
            return;
        }

        mainGroup.interrupt();
    }
}