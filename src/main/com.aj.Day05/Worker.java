public abstract class Worker implements WorkerApi{
    public abstract void work();

    public void showDairy(){
        System.out.println("起床！！！");
        System.out.println("吃饭！！！");
        System.out.println("坐公交！！！");
        work();
        Salary();
        System.out.println("下班！！！");
        System.out.println("睡觉！！！");
    }
}
