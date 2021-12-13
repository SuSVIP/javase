package kuang.struct;

public class BreakDemo06 {
    public static void main(String[] args) {
        int i=1;
        int j=1;
        while (i<100){
            i++;
            System.out.println(i);
            if(i==30)
                break;;//强行终止退出循环
        }
        System.out.println("终止循环");
    }
}
