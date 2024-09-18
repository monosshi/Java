public class priority extends Thread {
    public void run(){
        System.out.println("running thread name: "+Thread.currentThread().getName());
        System.out.println("running thread priority: "+Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        priority p1 = new priority();
        priority p2= new priority();

        p1.setPriority(Thread.MIN_PRIORITY);
        p1.setPriority(Thread.MAX_PRIORITY);

        p1.start();
        p2.start();
    }
    
}
