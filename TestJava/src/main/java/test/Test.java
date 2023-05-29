package test;
class mythread extends Thread
{
    @Override
    public void run() {
        System.out.println("hi");
    }
}
class mythread2 extends Thread
{
    @Override
    public void run() {
        System.out.println("hello");
    }
}
public class Test {
    public static void main(String[] args) {
        mythread m1= new mythread();
        mythread2 m2= new mythread2();
        m2.start();
        m1.start();
        Thread.currentThread().setDaemon(true);
        Thread.currentThread().setPriority(10);
    }
}
