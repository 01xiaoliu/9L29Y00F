package BTest;

import java.util.Scanner;

public class BilTest {
    public static void main(String[] args) {
       /* Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int x= sc.nextInt();
        int temp =x;
        int num=0;
        while (x>0){
            int ge =x%10;
            System.out.println(ge);
            x/=10;
            System.out.println(x);
            num=num*10+ge;
        }
        if(num==temp){
            System.out.println("是回文数");
        }*/

        System.out.println("------------");

        int count=0;
        Scanner sca =new Scanner(System.in);
        System.out.println("请输入一个正数(被除数):");
        int a=sca.nextInt();
        Scanner scan =new Scanner(System.in);
        System.out.println("请输入另一个正数(除数):");
        int b =scan.nextInt();
        while (a>=b){
            a=a -b;
            count++;
        }
        System.out.println("余数是"+a+"\n"+"商是"+count);

    }
}
