package kuang.method;

/**
 * 可变参数：1.在一个指定参数后加一个省略号（...）。
 *         2.一个方法只能有一个可变参数，且必须在最后声明，任何普通参数必须在它之前声明。
 */
public class Demo03 {
    public static void main(String[] args) {
        Demo03 demo03 = new Demo03();
        demo03.printMax(23,3,54,15,45.7,78,32);
    }
    public void  printMax(double ...numbers){
        if(numbers.length==0)
        System.out.println("空数组");
        double result=numbers[0];
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]>result)
            result=numbers[i];
        }
        System.out.println("最大值："+result);
    }
}
