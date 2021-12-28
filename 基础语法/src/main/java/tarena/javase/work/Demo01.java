package tarena.javase.work;

/**
 *   比较性能:
 *       a int i = 1; 重复 i=i+1
 *       b Integer i = 1; 重复 i=i+1;
 */
public class Demo01 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        Long sum = 0L; // 使用包装类相加
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println("耗时:"+(end-start)/1000.0);


        start = System.currentTimeMillis();
        long sum2 = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum2 += i; // 使用基本数据类型相加
        }
        System.out.println(sum2);
        long end2 = System.currentTimeMillis();
        System.out.println("耗时:"+(end2-start)/1000.0);


    }
}
