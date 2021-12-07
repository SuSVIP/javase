package kuang.scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入：");
        String str=scanner.nextLine();
        System.out.println("输出内容为："+str);
        scanner.close();
    }
}
