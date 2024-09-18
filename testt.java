public class testt {
    static int a = 10;

    static void increment() {
        System.out.println(++a);
    }

    static {
        System.out.println(a++);
    }

    public static void main(String[] args) {
        testt s= new testt();
        s.increment();
    }
}