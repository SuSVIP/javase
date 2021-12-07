package kuang.scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        //创建一个扫描对象，用于接收键盘数据
        Scanner scanner=new Scanner(System.in);//hello world
        System.out.println("使用nextLine方式接收：");

        //判断用户有没有输入字符串
        if(scanner.hasNextLine()){
            String str=scanner.nextLine();
            System.out.println("输出的内容："+str);//hello world
        }
        scanner.close();
  }
}
