package tarena.javase.Thread;

/**
 * 基本线程演示
 */
public class ThreadDemo {
    public static void main(String[] args){
        Person1 p1=new Person1();//p1实例
        Person2 p2=new Person2();//p2实例
        p1.start();
        p2.start();
        System.out.println("mainMethod over");

    }
}
class Person1 extends Thread{
    public void run(){
        for (int i = 0; i <3 ; i++) {
            System.out.println("谁啊");
        }
    }
}
class Person2 extends Thread{
    public void run(){
        for (int i = 0; i <3 ; i++) {
            System.out.println("查水表的");
        }
    }
}
