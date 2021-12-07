package kuang.scanner;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        //输入数字的总和与平均数,没输入一个数用回车确认，通过输入非数字结束并执行结果
        Scanner scanner=new Scanner(System.in);

        double sum=0;
        int m=0;
        while(scanner.hasNextDouble()){
            double x=scanner.nextDouble();
            m++;
            sum=sum+x;
        }

        System.out.println(m+"个数的和为："+sum);
        System.out.println(m+"个数的平均数为："+(sum/m));

        scanner.close();
    }


}
