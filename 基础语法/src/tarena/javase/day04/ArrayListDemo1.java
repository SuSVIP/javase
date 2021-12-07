package tarena.javase.day04;

import java.util.*;

/**
 * 数组转List
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        String[] names={"A","B","C"};
        /**
         *第1步。只读list（不能增删操作）
         */
        List list= Arrays.asList(names);
        System.out.println(list);
        /**
         * 第2步。复制为全功能list
         */
        list=new ArrayList(list);
        list.add("cdd");
        System.out.println(list);
        /**
         * 第3步。放入set合集
         */
        Set set=new HashSet(list);
        System.out.println(set);
    }
}
