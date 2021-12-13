package kuang.struct;

public class TestDemo01 {
    public static void main(String[] args) {
        //全等三角 5行
        for (int i = 1; i <=5; i++) {
            for (int j = 5; j>=i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++) {
                System.out.print(1);
                System.out.print(1);

            }
            for (int j = 1; j < i; j++) {
                System.out.print(1);
            }
            System.out.println(" ");
        }
    }
}
