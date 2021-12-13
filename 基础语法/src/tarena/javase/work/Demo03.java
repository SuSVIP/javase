package tarena.javase.work;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * 测试集合HashSet 的全部方法.
 *         add()
 *         addAll();
 *         remove()等
 */
public class Demo03 {
    /**
     * add(Object o)和addAll(Collection c)增加元素
     * contains(Object o)和containsAll(Collection c)判断元素是否存在
     * isEmpty()判断集合是否为空
     * remove(Object o)和removeAll(Collection c)删除元素
     * size()返回集合的大小
     * clear()清空集合
     * iterator()迭代器
     * toArray()将内容转到数组中
     * ————————————————
     * 版权声明：本文为CSDN博主「蹦吧啦哒哒哒」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
     * 原文链接：https://blog.csdn.net/weixin_41434306/article/details/88582488
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 1.add()和addAll()
         *
         */
        HashSet set1=new HashSet();
        HashSet set2=new HashSet();
        for(int i = 0;i<10;i++){
            //Set中的元素不能重复；
            set1.add(i);
            set1.add(i);
        }
        set1.addAll(set2);
        System.out.println(set1);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        //最终只会有一组0-9；

        /**
         * 2.remove()和removeAll()
         * remove(Object o)
         * 删除集合中指定的元素，如果该元素在集合中返回true表示删除成功；
         * 如果该元素不在集合中返回false表示是删除失败
         *
         * removeAll(Collection c)
         * 删除集合中与指定集合的元素匹配的元素，如果指定集合的元素有一个在被操作的集合中返回true表示删除成功；
         * 如果指定集合的元素都不在集合中返回false表示是删除失败
         *
         */

        set1.remove(0);
        System.out.println(set1);//[1, 2, 3, 4, 5, 6, 7, 8, 9]
        set2.addAll(set1);
        System.out.println(set2);//[1, 2, 3, 4, 5, 6, 7, 8, 9]
        set2.removeAll(set1);
        System.out.println(set2);//

        /**
         * 3.isEmpty()
         */
        System.out.println(set1.isEmpty());//false

        /**
         * 4.size()返回集合元素的数量
         */
        System.out.println(set1.size());//9

        /**
         * 5.iterator()返回对此集合中元素进行迭代的迭代器
         */
        Iterator<Integer> it = set1.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+"    ");//1    2    3    4    5    6    7    8    9
        }
        System.out.println();

        /**
         * 6.toArray()将Set的内容转到数组中
         */
        for (Object integer : set1.toArray()) {
            System.out.print(integer+",");
        }
        System.out.println();

        /**
         * 7.clear()
         */
        set1.clear();
        System.out.println(set1.size());

    }
}
