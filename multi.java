class multi implements Runnable {
    public void run(){
        for(int i=0;i<6;i++)
        {
    System.out.println(i);
        }

    
}
public static void main(String[] args) {
    multi m=new multi();
    Thread t1 =new Thread(m);
    Thread t2 =new Thread(m);
    
    t1.start();
    t2.start();
}

}





