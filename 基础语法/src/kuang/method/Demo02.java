package kuang.method;

/**
 * 重载：名同参不同：方法名必须相同，参数必须不同
 */
public class Demo02 {
    public static void main(String[] args) {
        Max(10,12);
        Max(10.0,12);
        Max(10,12.0);

    }
    public static int Max(int a, int b){
        System.out.println(a>b?a:b);
        return 0;
    }
    public static int Max(double a, double b){
        System.out.println(a>b?a:b);
        return 0;
    }
    public static double Max(int a, double b){
        System.out.println(a>b?a:b);
        return 0;
    }

}
