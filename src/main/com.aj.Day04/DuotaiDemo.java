public class DuotaiDemo {
    public void getName(Human human){
         human.name();
    }
    public static void main(String[] args) {
        DuotaiDemo duotaiDemo = new DuotaiDemo();
        Student student = new Student();
        duotaiDemo.getName(student);
        Teacher teacher = new Teacher();
        duotaiDemo.getName(teacher);
    }
}
