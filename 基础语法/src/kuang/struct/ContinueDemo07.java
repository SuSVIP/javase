package kuang.struct;

public class ContinueDemo07 {
    public static void main(String[] args) {
        int i=1;
        while (i<100){
            i++;
            if(i%10==0) {
                System.out.println(" ");
                continue;//跳过进行下一个循环
            }
            System.out.print(i);
        }
        //System.out.println(i);
    }
}
