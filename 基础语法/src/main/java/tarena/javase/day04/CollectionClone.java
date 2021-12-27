package tarena.javase.day04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * 1.注：
 *  list2 是浅表复制，仅第 1 层复制了，第 2 层复制的是对象的引用
 *  list3 是赋值
 *  clone()只能复制本类型
 *
 *2. 注：
 *  “复制构造器”可以复制不同类型的集合，使用起来较方便
 *  继承自 Map 的集合同继承自 Collection 的集合不能相互复制（结构不同）
 */
public class CollectionClone {
    public static void main(String[] args) {
        ArrayList<Foo> list=new ArrayList<Foo>();
        list.add(new Foo());
        list.add(new Foo());

        //一。浅表复制_clone()
        //1.经过clone()产生了新对象list2
        ArrayList<Foo> list2= (ArrayList<Foo>) list.clone();
        //2.list3和list是同一个对象引用
        ArrayList<Foo> list3= list;
        System.out.println(list3==list);//true
        //3.浅层复制测试
        //第一层复制了
        System.out.println(list2==list);//false
        //第二层元素没被复制
        System.out.println(list2.get(0)==list.get(0));//true

        //二。浅表复制_"复制构造器"
        //复制构造器演示
        //1.所有集合都有“复制构造器”，是浅表复制
        //2.“复制构造器”的参数是多态的，可以在不同种类的集合中复制
        LinkedList<Foo> list4=new LinkedList<Foo>(list);
        HashSet<Foo> hashSet=new HashSet<Foo>(list);
        System.out.println(list4.containsAll(list));//true
        System.out.println(hashSet.containsAll(list));//true
    }
}
//containsAll():用于检测是否包含指定集合中的所有元素。
 class Foo{int a=1;}
