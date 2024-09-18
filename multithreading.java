public class multithreading extends Thread {
    public void run(){
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        multithreading m = new multithreading();
        multithreading m1 = new multithreading();
        multithreading m2 = new multithreading();
        m.start();
        try {
            m.join(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

      m1.start();
      m2.start();
    }
}
 


