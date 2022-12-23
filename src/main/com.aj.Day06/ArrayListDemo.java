import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo
{
    public static void main(String[] args) {

            ArrayList<Pupil> arrayList= new ArrayList<Pupil>();
            Pupil pupil = new Pupil();
            pupil.setName("Faker");
            pupil.setAge(18);
            pupil.setGender("男");
            Pupil pupil1 = new Pupil();
            pupil1.setName("theshy");
            pupil1.setAge(19);
            pupil1.setGender("男");
            Pupil pupil2 = new Pupil();
            pupil2.setName("Miss");
            pupil2.setAge(28);
            pupil2.setGender("女");
            Pupil pupil3 = new Pupil();
            pupil3.setName("scout");
            pupil3.setAge(23);
            pupil3.setGender("男");
            arrayList.add(pupil);
            arrayList.add(pupil1);
            arrayList.add(pupil2);
            arrayList.add(pupil3);
        System.out.println(arrayList.size());
        System.out.print(arrayList.get(1).getName()+"\t");
        System.out.print(arrayList.get(1).getAge()+"\t");
        System.out.println(arrayList.get(1).getGender());
            arrayList.remove(pupil);
            arrayList.remove(2);
        System.out.println(arrayList.size());
        System.out.println(arrayList.contains(pupil3));
        System.out.println(arrayList.contains(pupil2));
        System.out.println(arrayList.isEmpty());
        /**
         * 增强for循环遍历
         */
        for (Pupil pup: arrayList) {
            System.out.print(pup.getName()+"\t");
            System.out.print(pup.getAge()+"\t");
            System.out.println(pup.getGender()+"\t");
        }
        System.out.println("======================================================");
        /**
         * 普通for循环遍历
         */
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i).getName()+"\t");
            System.out.print(arrayList.get(i).getAge()+"\t");
            System.out.println(arrayList.get(i).getGender()+"\t");
        }
        System.out.println("-------------------------------------------------");
        /**
         * iterator循环遍历
         */
             Iterator<Pupil> iterator= arrayList.iterator();
             while(iterator.hasNext()){
                 //System.out.println(iterator.next().getName()+"\t"+iterator.next().getAge()+"\t"+iterator.next().getGender());
                 System.out.print(iterator.next().getName()+"\t");
             }
               System.out.println();
             Iterator<Pupil> iterator1= arrayList.iterator();
             while(iterator1.hasNext()){
                 //System.out.println(iterator.next().getName()+"\t"+iterator.next().getAge()+"\t"+iterator.next().getGender());
                 System.out.print(iterator1.next().getAge()+"\t");
             }
               System.out.println();
             Iterator<Pupil> iterator2= arrayList.iterator();
             while(iterator2.hasNext()){
                 //System.out.println(iterator.next().getName()+"\t"+iterator.next().getAge()+"\t"+iterator.next().getGender());
                 System.out.print(iterator2.next().getGender()+"\t");
             }
    }
}
