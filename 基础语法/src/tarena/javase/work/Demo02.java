package tarena.javase.work;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 创建一个List<String>集合, 添加多个测试数据
 *     使用Collections.sort() 实现排序.
 *     在排序结果中使用 Collections.binarySearch()
 *     查询一个字符串的位置序号.
 */
public class Demo02 {
    public static void main(String[] args) {
        List<String> lists=new ArrayList<>();
        lists.add("8");
        lists.add("7");
        lists.add("9");
        lists.add("5");
        //lists中的对象String 本身含有compareTo方法，所以可以直接调用sort方法，按自然顺序排序，即升序排序
        Collections.sort(lists);
        System.out.println(lists);//[5, 7, 8, 9]
        int a=Collections.binarySearch(lists,"9");
        System.out.println(a);//3
    }

}
