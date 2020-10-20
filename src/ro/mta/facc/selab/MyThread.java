package ro.mta.facc.selab;

public class MyThread extends Thread{


    @Override
    public synchronized void run(){

        try {
            Thread.sleep(20 * 100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
