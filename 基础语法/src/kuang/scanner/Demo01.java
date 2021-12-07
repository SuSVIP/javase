package kuang.scanner;

import java.util.Scanner;

/**
 * Scanner类的next()和nextLine()方法获取输入的字符串，
 * 在读之前一般需要使用hasNext()与hasNextLine()判断是否还有输入的数据。
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建一个扫描对象，用于接收键盘数据
      Scanner scanner=new Scanner(System.in);//hello world
        System.out.println("使用next方式接收：");

      //判断用户有没有输入字符串
        if(scanner.hasNext()){
            String str=scanner.next();
            System.out.println("输出的内容："+str);//hello
        }

        scanner.close();
    }

}
