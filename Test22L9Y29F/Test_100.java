package Test22L9Y29F;

interface CalcTime{
    public void calcTime();
}
class Tool{
    public static long getTime(CalcTime time){
        long start =System.currentTimeMillis();
        time.calcTime();//接口回调
        long end =System.currentTimeMillis();//单位毫秒
        return end-start;
    }
}
public class Test_100 {
    public static void main(String[] args) {
        long count = Tool.getTime(new CalcTime(){
            @Override
            public void calcTime(){
                String a ="zhangsan";
                for (int i = 0; i <10000 ; i++) {
                    a+=i;
                }
            }
        });
        System.out.println("计算时间为:"+count);
    }
}

