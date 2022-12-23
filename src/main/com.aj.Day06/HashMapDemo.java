import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Pupil> hashMap = new HashMap<String,Pupil>();
        Pupil pupil = new Pupil();
        pupil.setName("张三");
        pupil.setAge(18);
        pupil.setGender("男");
        Pupil pupil1 = new Pupil();
        pupil1.setName("张三");
        pupil1.setAge(18);
        pupil1.setGender("男");
        Pupil pupil2 = new Pupil();
        pupil2.setName("张三");
        pupil2.setAge(18);
        pupil2.setGender("男");
        hashMap.put("01",pupil);
        hashMap.put("02",pupil1);
        hashMap.put("03",pupil2);
    }
}
