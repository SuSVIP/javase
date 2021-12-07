package tarena.javase.day01;
/**
 * char数组与String
 */
public class ch1 {
    public static void main(String[] args) {
        char[] chs1={'北','京'};
        char[] chs2={'达','内','科','技'};
        /**
         * concat:字符拼接
         * s1称为常量，“北京”称为字面量
         */
        String s1="北京";
        String s2="达内科技";
        String s3=s1.concat(s2);
        System.out.println(s3);

        /**
         * charAt:返回指定索引处的字符。索引范围为从 0 到 length() - 1
         */
        String s4="北京达内科技";
        char result=s4.charAt(2);
        System.out.println(result);
    }
}
