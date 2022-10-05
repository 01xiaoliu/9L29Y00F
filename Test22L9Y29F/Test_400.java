package Test22L9Y29F;

public class Test_400 {
    public static void main(String[] args) {
        int a = 10;
        Integer integer= new Integer(a);
        integer=Integer.valueOf(a);

        a =integer.intValue();

        integer = 5;
        a = integer;
        String s = integer+ "";
        a =Integer.parseInt(s);
        double d =Double.parseDouble(s);
    }
}
