public class Main  extends Thread{
     public void run(){
        System.out.println("running");
     }

     public static void main(String[] args) {
       
        Main n= new Main();
        Main n1= new Main();
        System.out.println("Name of n "+ n.getName());
        System.out.println("Name of n1 "+ n1.getName());
        System.out.println("id of n "+ n.getId());
        
        n.start();
        n1.start();
        n.setName("monosshi");
        n1.setName("zaman");

        System.out.println("After changing name of n "+ n.getName());
        
     }
}






