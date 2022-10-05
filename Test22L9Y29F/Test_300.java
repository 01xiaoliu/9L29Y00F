package Test22L9Y29F;

public class Test_300{
    public static void main(String[] args) {
        Teacher teacher=new Teacher("lang");
        Teacher teacher1=new Teacher("l");
        System.out.println(teacher.equals(teacher1));

        new Teacher("p");
        System.gc();//当没有内存耗尽时，不会自动回收;需要手动调用gc的方法去回收
    }
}
class Teacher{
    private String name;
    public Teacher(String name){
        this.name =name;
    }
    public boolean equals(Object obj1){
        if (this==obj1){
            return true;
        }
        if (obj1==null){
            return false;
        }
        if (obj1 instanceof Teacher){
            Teacher teacher =(Teacher) obj1;
            return this.name.equals(teacher.name);
        }
        return false;
    }
    @Override
    protected void finalize()throws Throwable{
        System.out.println("出现了垃圾"+name);
    }
}