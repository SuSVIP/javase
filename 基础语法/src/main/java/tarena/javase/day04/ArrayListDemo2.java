package tarena.javase.day04;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 集合转数组
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("a");
        list.add("b");
        /**
         * 集合转为 Object[]
         */
        Object[] array1=list.toArray();
        /**
         * 集合转为指定类型数组
         */
        //String[] array2= (String[]) list.toArray(new String[]{});
    }
}
