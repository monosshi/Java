class ne extends Thread{
    public void run(){
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        ne n=new ne();
        n.start();
    }

}


