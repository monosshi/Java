public class imp implements Runnable {
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("xyz");
    }
    public static void main(String[] args) {
        imp m= new imp();
        Thread t1= new Thread(m,"ABC");
        t1.start();
    }
}



