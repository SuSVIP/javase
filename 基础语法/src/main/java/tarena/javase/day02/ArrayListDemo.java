package tarena.javase.day02;


import javax.smartcardio.Card;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //1.StringBuilder和ArrayList对比
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append('北');
        stringBuilder.append('京');
        stringBuilder.insert(0,'中');
        stringBuilder.insert(1,'国');
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.charAt(2));

        ArrayList list=new ArrayList();
        list.add('北');
        list.add('京');
        list.add(0,'中');
        list.add(1,'国');
        System.out.println(list);
        System.out.println(list.indexOf('京'));
        System.out.println(list.get(2));

        //2.向ArrayList中添加card对象
        ArrayList cards=new ArrayList();//变长数组


    }

}
