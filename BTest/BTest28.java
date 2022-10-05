package BTest;

import java.util.Random;

public class BTest28 {
    public static void main(String[] args) {
        //定义一个数组，存入1,2,3,4,5按照要求交换索引对应的元素。
        int arr[]={1,2,3,4,5};
        //交换前：1,2,3,4,5
        //交换后：5,4,3,2,1
        for (int i = 0,j= arr.length-1; i < j; i++,j--) {
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        Random a =new Random();//Random随机函数 a(变量名) =new Random();
    }
}
