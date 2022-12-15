public class HelloWorld{
    public static void main(String[] args) {
//        System.out.println(HelloWorld.class.getName());
//        System.out.println(HelloWorld.class.getCanonicalName());
//        System.out.println(HelloWorld.class.getSimpleName());
//        System.out.println("Hello World!!!");
//        System.out.println(Package.class.getName());
        int a =1;
        int b=2;
        int c = 0;
        System.out.println(a%b);
//        System.out.println(a++);
        System.out.println(++a);

        int result = 0;
        for (int i = 0; i <= 100; i++) {
            if (i==50){
                continue;
            }else if (i==100) {
                break;
            }
            result+=i;
        }
        System.out.println("for循环-1-100求和值："+result);
        int res=0;
        do {
            res+=c;
            c++;
        }while (c<=100);
        System.out.println("do...while循环1-100求和："+res);
        int res1 = 0;
        int d = 0;
        while (d<=100){
            res1+=d;
            d++;
        }
        System.out.println("while循环1-100求和"+res1);
        System.out.println("======================九九乘法表====================");
        for (int i = 1; i <10 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }

    }
}
