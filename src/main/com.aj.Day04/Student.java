import javax.swing.*;

public class Student extends Human{
    public Student(){
        super("含笑半步颠");//父类带参构造对象引用
        //System.out.println("Student.Student()");
    }

    public static void main(String[] args) {
       Student student = new Student();
       student.test();
    }

    /**
     * 重写（覆盖）父类已有的方法
     */
    @Override
    public void test() {
        super.test();//父类函数引用
        System.out.println("子类的测试函数！！！");
    }

    @Override
    public void name() {
        super.name();
        System.out.println("学生");
    }
}
