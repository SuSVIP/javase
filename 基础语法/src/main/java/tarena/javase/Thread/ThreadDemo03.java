package tarena.javase.Thread;

/**
 * 线程优先级测试
 * 默认5级，默认最高10
 */
public class ThreadDemo03 {
    public static void main(String[] args) {
        PersonA pa=new PersonA();
        PersonB pb=new PersonB();
        PersonC pc=new PersonC();
        pc.setPriority(Thread.MAX_PRIORITY);//设置最高优先级
        pa.setPriority(Thread.MIN_PRIORITY);//设置最低优先级
        pa.start();
        pb.start();
        pc.start();
        System.out.println("main over");
    }
}
class PersonA extends Thread{
    public void run(){
        System.out.println("开门");
        Thread.yield();
    }
}
class PersonB extends Thread{
    public void run(){
        System.out.println("谁啊");
        Thread.yield();
    }
}
class PersonC extends Thread{
    public void run(){
        System.out.println("查水表的");
        Thread.yield();
    }
}