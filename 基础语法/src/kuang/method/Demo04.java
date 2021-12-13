package kuang.method;

/**
 * 递归：自己调用自己
 * 结构：
 *     递归头：什么时候不用调用自身方法。没有头，将会陷入死循环。
 *     递归体：什么时候需要调用自身方法。
 */
public class Demo04 {
    public static void main(String[] args) {
        System.out.println(f(5));
    }

    public static int f(int i){
        if(i==1){
            return 1;
        }else {
            return i*f(i-1);
        }
    }
}
