package multithreading;

public class MultiThreadDemo extends Thread{

    public void run(){
        for (int i=0;i<10;i++){
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MultiThreadDemo demo = new MultiThreadDemo();
        demo.run();
        Thread t1 = new Thread(demo);
        Thread t2 = new Thread(demo);
        t1.setName("codekul");
        t2.setName("Melayer");
        t1.start();
        t2.start();
        t2.join();
        System.out.println(t1.getName());

    }
    }
