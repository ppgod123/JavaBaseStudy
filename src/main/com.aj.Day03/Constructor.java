import java.text.SimpleDateFormat;
import java.util.Date;

public class Constructor {
    private String name;
    private int age;
    private String gender;
    private int getAge() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Constructor(){

    }

    public Constructor(String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //获取当前时间并格式化
    public String getDateTime(){
        Date date= new Date();
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(date);
    };

    public void sendMessage(String []names){
        for (String name:names) {
            System.out.println(name+",周末有空吗？一起去打项羽啊！！！！");
            System.out.println("发件人:" + this.name +"\t"+ "发件时间:"+getDateTime() );
        }
    }
    //函数方法重载
    public void setScore(String kk){
        System.out.println(kk);
    }
    public void setScore(String kk,String hh){
        System.out.println(kk);
    }
    public void setScore(String hh,int kk){
        System.out.println(kk);
    }
    public void setScore(int kk){
        System.out.println(kk);
    }

    public static void main(String[] args) {
       Constructor constructor1= new Constructor();
       System.out.println("姓名:"+constructor1.name+"\t"+"年龄:"+constructor1.age+"\t"+"性别:"+constructor1.gender);
       Constructor constructor2 = new Constructor("刘邦",28,"男");
       System.out.println("姓名:"+constructor2.name+"\t"+"年龄:"+constructor2.age+"\t"+"性别:"+constructor2.gender);
       String [] arr01 = {"韩信","英布","张良","萧何","陈平"};
       constructor2.sendMessage(arr01);

    }
}
