public class Student1 extends Worker implements WorkerApi{
    @Override
    public void work() {
        System.out.println("上学！！！");
    }

    @Override
    public void Salary() {
        System.out.println(3000);
    }
}
