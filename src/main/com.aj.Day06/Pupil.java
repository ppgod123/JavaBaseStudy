public class Pupil {
    private String name;
    private  int age;
    private String gender;

    public Pupil(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Pupil() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }





    public String toString(){
        return  "姓名:"+this.name+"\t"+"年龄:"+this.age+"\t"+"性别:"+this.gender;
    }
}
