package tarena.javase.work;

import javax.xml.bind.SchemaOutputResolver;
import java.util.HashMap;

/**
 * HashMap的全部方法
 *  put()
 *  get()
 *  remove()
 *  values() 等
 */
public class Demo04 {
    public static void main(String[] args) {
        //Hashmap的存值：
        HashMap hashmap=new HashMap();
        hashmap.put(0,"北");
        hashmap.put(1,"京");
        hashmap.put(2,"中");
        hashmap.put(3,"国");
        System.out.println(hashmap);

        //Hashmap的取值：
        System.out.println(hashmap.get(2));

        //Hashmap的判断为空
        System.out.println(hashmap.isEmpty());//false

        //Hashmap判断是否含有key：
        System.out.println(hashmap.containsKey(2));//true
        System.out.println(hashmap.containsKey("中"));//false

        //Hashmap判断是否含有value：
        System.out.println(hashmap.containsValue(2));//false
        System.out.println(hashmap.containsValue("中"));//true

        //Hashmap删除这个key值下的value：
        System.out.println(hashmap.remove(3));

        //Hashmap显示所有的value值：
        System.out.println(hashmap.values());

        //Hashmap的元素个数：
        System.out.println(hashmap.size());//3

        //显示key：
        hashmap.put(5,"欢");
        hashmap.put(5,"迎");
        System.out.println(hashmap.keySet());//[0, 1, 2, 5]

       //Hashmap显示所有的key和value：
        System.out.println(hashmap.entrySet());//[0=北, 1=京, 2=中, 5=迎]

        //Hashmap替换这个key的value：(java8)
        /*value*///判断map中是否存在这个key
        System.out.println(hashmap);//{0=北, 1=京, 2=中, 5=迎}
        System.out.println(hashmap.replace(0,"南"));
        System.out.println(hashmap);//{0=南, 1=京, 2=中, 5=迎}
    }
}
