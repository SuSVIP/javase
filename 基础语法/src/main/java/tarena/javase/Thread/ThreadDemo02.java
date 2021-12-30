package tarena.javase.Thread;

/**
 * 线程的yield()方法
 */
public class ThreadDemo02 {
    public static void main(String[] args) {
        Person3 p3=new Person3();
        Person4 p4=new Person4();
        p3.start();
        p4.start();
        System.out.println("main over");
    }
}
class Person3 extends Thread{
    public void run(){
        for (int i = 0; i <3; i++) {
            System.out.println("谁啊");
            Thread.yield();
        }
    }
}
class  Person4 extends Thread{
    public void run(){
        for (int i = 0; i <3 ; i++) {
            System.out.println("查水表的");
            Thread.yield();
        }
    }
}