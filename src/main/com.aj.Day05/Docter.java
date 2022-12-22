public class Docter extends Worker implements WorkerApi{
    @Override
    public void work() {
        System.out.println("看病！！！");
    }

    @Override
    public void Salary() {
        System.out.println(10000);
    }
}
