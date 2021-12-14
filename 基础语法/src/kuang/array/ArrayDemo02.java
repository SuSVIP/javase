package kuang.array;

/**
 * 数组反转
 */
public class ArrayDemo02 {
    public static void main(String[] args) {
        int[] arrays={1,2,3,4,5};
        //jdk1.5 适合打印，不适合对数组单个数据的操作
      /*  for (int array : arrays) {
            System.out.println(array);
        }*/
        //打印
       // Printarrays(arrays);
        //数组反转
       int[] reverse=reverse(arrays);
        Printarrays(reverse);
    }

    //数组反转
    public static int[] reverse(int[] arrays){
        int[] result=new int[arrays.length];
        for (int i = 0,j=result.length-1; i <=result.length-1 ; i++,j--) {
            result[j]=arrays[i];
        }
        return result;
    }

    //打印数组元素
    public static void Printarrays( int[] arrays){
        for (int i = 0; i <= arrays.length-1; i++) {
            System.out.print(arrays[i]+" ");
        }
    }



}
