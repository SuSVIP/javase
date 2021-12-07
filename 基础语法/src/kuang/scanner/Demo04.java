package kuang.scanner;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //从键盘输入
        int i=0;
        float f=0.0f;
        System.out.println("请输入一个整数：");
        if(scanner.hasNextInt()){
            i=scanner.nextInt();
            System.out.println("输入的整数："+i);
        }else {
            System.out.println("输入的不是整数");
        }

        System.out.println("请输入一个小数：");
        if(scanner.hasNextFloat()){
            f=scanner.nextFloat();
            System.out.println("输入的小数："+f);
        }else {
            System.out.println("输入的不是小数");
        }

        scanner.close();
    }
}
