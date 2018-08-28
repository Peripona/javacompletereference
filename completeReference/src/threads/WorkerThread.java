package threads;

public class WorkerThread implements Runnable {
    Thread worker;
    public WorkerThread(String name) {
        worker = new Thread(name);
        worker.start();
    }

    public Thread getWorker() {
        return worker;
    }

    @Override
    public void run() {

    }
}
