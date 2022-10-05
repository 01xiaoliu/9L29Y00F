package Test22L9Y29F;

class Person{}
public class Test {
    public static void main(String[] args) {
        Object obj =new Person();
        fun(new Person());
        Object obje =getObject();
    }
    public static void fun(Object obj){}

    public static Object getObject(){
        return new Person();
    }
}
