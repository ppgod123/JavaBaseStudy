public class Teacher1 extends Worker implements WorkerApi{
    @Override
    public void work() {
        System.out.println("上课！！！");
    }

    @Override
    public void Salary() {
        System.out.println(8000);
    }
}
