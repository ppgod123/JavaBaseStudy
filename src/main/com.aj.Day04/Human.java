public class Human {
    private String name;
    private String sex;
    private int age;
    private double height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public  Human(){
        System.out.println("Human.Human()");
    }
    public  Human(String aa){
        System.out.println("带参构造函数："+aa);
    }
    public  Human(String name,String sex,int age,double height){
        this.name =name;
        this.sex = sex;
        this.age = age;
        this.height = height;
    }

    public void test(){
        System.out.println("父类的测试函数！！！");
    }
    public void name(){
        System.out.println("父类名88888888");
    }
}
