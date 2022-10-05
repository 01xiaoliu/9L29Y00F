package Test22L9Y29F;

class Student{
    private String name;
    public Student(){}

    public Student(String name) {
        this.name = name;
    }

    public int hashCode(){return name.hashCode();}

    public String toString() {
        return "Student{name = " + name + "}";//
    }
}
public class Test_200 {
    public static void main(String[] args) {
        Class p1 = new Person().getClass();
        Class p2 = new Person().getClass();
        System.out.println(p1==p2);

        Class p3 = new String().getClass();
        System.out.println(p1==p3);

        Person person =new Person();
        System.out.println(person.hashCode());
        System.out.println(person.hashCode());
        System.out.println(new  Person().hashCode());
        System.out.println("======= =======");

        StudentXiTo.Student st =new StudentXiTo.Student("fah");
        StudentXiTo.Student st1 =new StudentXiTo.Student("fah");
        System.out.println(st.hashCode());
        System.out.println(st1.hashCode());

        System.out.println(st);


    }
}
