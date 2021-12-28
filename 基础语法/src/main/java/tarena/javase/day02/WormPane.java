package tarena.javase.day02;

public class WormPane {

        private Worm worm;    /**蛇*/
        private int rows=10;  /**行数*/
        private int cols=32;  /**列数*/

        //创建面板
        public WormPane(){
            worm=new Worm(); /**设置一条默认的蛇*/
        }

        public Worm getWorm() {
            return worm;
        }

        /**画出面板*/
        public void print(){
            for (int i = 0; i <rows ; i++) {
                for (int j = 0; j <cols ; j++) {
                    if(i==0||i==rows-1){
                        System.out.print("-");//不能输出回车
                    }else if(j==0||j==cols-1){
                        System.out.print("|");
                    }else {
                        System.out.print("　");
                    }
                }
                System.out.println();//一行结束后回车
            }
        }

    public static void main(String[] args) {
            int k=10;
            int m=32;
        for (int i = 0; i <k ; i++) {
            for (int j = 0; j <m; j++) {
                if(i==0||i==k-1){
                    System.out.print("—");//不能输出回车
                }else if(j==0||j==m-1){
                    System.out.print("|");
                }else {
                    System.out.print("　");
                }
            }
            System.out.println();//一行结束后回车
        }
    }
    }


